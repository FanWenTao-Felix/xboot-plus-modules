package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigJinyearchives;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.JinyeArchivesService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "精液档案")
@RequestMapping("/xboot/ZpigManager/JinyeArchives")
@CacheConfig(cacheNames = "jinyeArchives")
@CrossOrigin
public class JinyeArchivesController {
    private final JinyeArchivesService jinyeArchivesService;

    @Autowired
    public JinyeArchivesController(JinyeArchivesService jinyeArchivesService) {
        this.jinyeArchivesService = jinyeArchivesService;
    }

    @RequestMapping(value = "selectArchives", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪场下符合要求的精液档案")
    public Result<?> selectArchives(String orgId){
        List<CtPigJinyearchives> list = jinyeArchivesService.selectByOrg(orgId);
        if (list.size() > 0) {
            return new ResultUtil<List<CtPigJinyearchives>>().setData(list);
        }else{
            return ResultUtil.error("没有结果或查询出错");
        }
    }

    @RequestMapping(value = "selectByPrimary", method = RequestMethod.GET)
    @ApiOperation(value = "查询精液档案")
    public Result< ? > selectByPrimary(String fid) {
        CtPigJinyearchives ctPigJinyearchives = jinyeArchivesService.selectByPrimaryKey(fid);
        if (ctPigJinyearchives == null) {
            return ResultUtil.error("没有结果或查询出错");
        }else {
            return new ResultUtil<CtPigJinyearchives>().setData(ctPigJinyearchives);
        }
    }
}
