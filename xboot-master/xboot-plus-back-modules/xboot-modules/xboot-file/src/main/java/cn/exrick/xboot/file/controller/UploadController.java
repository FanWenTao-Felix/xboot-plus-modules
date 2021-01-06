package cn.exrick.xboot.file.controller;

import cn.exrick.xboot.core.common.constant.CommonConstant;
import cn.exrick.xboot.core.common.constant.SettingConstant;
import cn.exrick.xboot.core.common.utils.Base64DecodeMultipartFile;
import cn.exrick.xboot.core.common.utils.CommonUtil;
import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import cn.exrick.xboot.core.entity.Setting;
import cn.exrick.xboot.core.service.SettingService;
import cn.exrick.xboot.core.vo.OssSetting;
import cn.exrick.xboot.file.entity.File;
import cn.exrick.xboot.file.manage.FileManageFactory;
import cn.exrick.xboot.file.service.FileService;
import cn.hutool.core.util.StrUtil;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

/**
 * @author Exrickx
 */
@Slf4j
@RestController
@Api(description = "文件上传接口")
@RequestMapping("/xboot/upload")
@Transactional
public class UploadController {

    @Autowired
    private FileManageFactory fileManageFactory;

    @Autowired
    private SettingService settingService;

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    @ApiOperation(value = "文件上传")
    public Result<Object> upload(@RequestParam(required = false) MultipartFile file,
                                 @RequestParam(required = false) String base64,
                                 HttpServletRequest request) {

        Setting setting = settingService.get(SettingConstant.OSS_USED);
        if(setting==null|| StrUtil.isBlank(setting.getValue())){
            return ResultUtil.error(501, "您还未配置OSS存储服务");
        }

        if(StrUtil.isNotBlank(base64)){
            // base64上传
            file = Base64DecodeMultipartFile.base64Convert(base64);
        }
        String result = "";
        String fKey = CommonUtil.renamePic(file.getOriginalFilename());
        File f = new File();
        try {
            InputStream inputStream = file.getInputStream();
            // 上传至第三方云服务或服务器
            result = fileManageFactory.getFileManage(null).inputStreamUpload(inputStream, fKey, file);
            f.setLocation(getType(setting.getValue()));
            // 保存数据信息至数据库
            f.setName(file.getOriginalFilename());
            f.setSize(file.getSize());
            f.setType(file.getContentType());
            f.setFKey(fKey);
            f.setUrl(result);
            fileService.save(f);
        } catch (Exception e) {
            log.error(e.toString());
            return ResultUtil.error(e.toString());
        }
        if(setting.getValue().equals(SettingConstant.LOCAL_OSS)){
            OssSetting os = new Gson().fromJson(settingService.get(SettingConstant.LOCAL_OSS).getValue(), OssSetting.class);
            result = os.getHttp() + os.getEndpoint() + "/" + f.getId();
        }
        return ResultUtil.data(result);
    }

    public Integer getType(String type){
        switch (type){
            case SettingConstant.QINIU_OSS:
                return CommonConstant.OSS_QINIU;
            case SettingConstant.ALI_OSS:
                return CommonConstant.OSS_ALI;
            case SettingConstant.TENCENT_OSS:
                return CommonConstant.OSS_TENCENT;
            case SettingConstant.MINIO_OSS:
                return CommonConstant.OSS_MINIO;
            case SettingConstant.LOCAL_OSS:
                return CommonConstant.OSS_LOCAL;
            default:
                return -1;
        }
    }
}
