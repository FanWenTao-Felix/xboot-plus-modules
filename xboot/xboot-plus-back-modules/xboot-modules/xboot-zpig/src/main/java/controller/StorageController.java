package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.TOrgStorage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.OrgStorageService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "组织单元")
@RequestMapping("/xboot/ZpigManager/Storage")
@CacheConfig(cacheNames = "storage")
@CrossOrigin
public class StorageController {
    private final OrgStorageService orgStorageService;

    @Autowired
    public StorageController(OrgStorageService orgStorageService) {
        this.orgStorageService = orgStorageService;
    }

    @RequestMapping(value = "selectStorageByFid", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪场")
    public Result<?> selectStorageByFid(@NotNull String fid){
        TOrgStorage tOrgStorage = orgStorageService.findAllByFid(fid);
        if (tOrgStorage == null  || "".equals(tOrgStorage)) {
            return  ResultUtil.error("未查到该猪场");
        }else {
            return new ResultUtil().setData(tOrgStorage);
        }
    }

    @RequestMapping(value = "selectStorage", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪场")
    public Result<?> selectStorage() {
        List<TOrgStorage> list = orgStorageService.findAllByType();
        if (list != null && list.size() > 0) {
            return new ResultUtil<List<TOrgStorage>>().setData(list);
        }else {
            return ResultUtil.error("查询出错,未查到猪场");
        }
    }

    @RequestMapping(value = "selectStorageByName", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询猪场")
    public Result<?> selectStorageByName(@NotNull String name) {
        List<TOrgStorage> list = orgStorageService.findByName(name);
        if (list != null && list.size() > 0) {
            return new ResultUtil<List<TOrgStorage>>().setData(list);
        }else {
            return ResultUtil.error("查询出错,未查到猪场");
        }
    }
}
