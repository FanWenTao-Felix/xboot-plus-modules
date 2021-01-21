package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.TPmUserService;

import javax.validation.constraints.NotNull;

/**
 * @author AIERXUAN
 */

@Slf4j
@RestController
@Api(description = "云之家信息")
@RequestMapping("/xboot/ZpigManager/System")
@CacheConfig(cacheNames = "system")
@CrossOrigin
public class SystemInfoController {
    private final TPmUserService tPmUserService;

    @Autowired
    public SystemInfoController(TPmUserService tPmUserService) {
        this.tPmUserService = tPmUserService;
    }

    @RequestMapping(value = "selectUser", method = RequestMethod.GET)
    @ApiOperation(value = "查询系统用户")
    public Result<String> selectUser(@NotNull String openId){
        String userInfo = tPmUserService.selectUser(openId);
        if (userInfo == null) {
            return ResultUtil.error("未查询到系统用户信息");
        }else {
            return new ResultUtil<String>().setData(userInfo,"查询用户信息成功");
        }
    }

    public Result<String> selectOrigination(){
        String originationInfo = tPmUserService.selectOrgUrl();
        if (originationInfo == null) {
            return ResultUtil.error("未查询到系统用户信息");
        }else {
            return new ResultUtil<String>().setData(originationInfo,"查询用户信息成功");
        }
    }
}
