package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigSemendistribution;
import entity.TPmUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.SemenDistributionService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "采集记录")
@RequestMapping("/xboot/ZpigManager/Distribution")
@CacheConfig(cacheNames = "distribution")
@CrossOrigin
public class DistributionController {
    private final SemenDistributionService semenDistributionService;

    @Autowired
    public DistributionController(SemenDistributionService semenDistributionService) {
        this.semenDistributionService = semenDistributionService;
    }

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪场未审核的发放记录")
    public Result< ? > selectAll(String zhuSheId){
        List<CtPigSemendistribution> list = semenDistributionService.selectAll(zhuSheId);
        if (list == null) {
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigSemendistribution>>().setData(list);
        }
    }

    @RequestMapping(value = "selectByzhuSheId", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询指定猪场未审核的发放记录")
    public Result< ? > selectByzhuSheId(String zhuSheId, String name, String startDate, String endDate){
        List<CtPigSemendistribution> list = semenDistributionService.selectByzhuSheId(zhuSheId, name, startDate, endDate);
        if (list == null) {
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigSemendistribution>>().setData(list);
        }
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiOperation(value = "插入发放记录")
    public Result< ? > insert(CtPigSemendistribution ctPigSemendistribution){
        Integer result = semenDistributionService.insert(ctPigSemendistribution);
        if (result == null) {
            return ResultUtil.error("插入失败");
        }else {
            return ResultUtil.success("插入成功");
        }
    }

    @RequestMapping(value = "updateIfAuditing", method = RequestMethod.POST)
    @ApiOperation(value = "审核")
    public Result< ? > updateIfAuditing(List<CtPigSemendistribution> list , TPmUser tPmUser){
        List<Integer> result = semenDistributionService.updateIfAuditing(list, tPmUser);
        if (result == null || result.size() < list.size()) {
            return ResultUtil.error("审核失败");
        }else {
            return ResultUtil.success("审核成功");
        }
    }

    @RequestMapping(value = "delByFids", method = RequestMethod.POST)
    @ApiOperation(value = "删除")
    public Result< ? > delByFids(CtPigSemendistribution ctPigSemendistribution){
        int result = semenDistributionService.delByFids(ctPigSemendistribution);
        if (result == 0) {
            return ResultUtil.error("删除失败");
        }else {
            return ResultUtil.success("删除成功");
        }
    }

    @RequestMapping(value = "updateAll", method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public Result< ? > updateAll(CtPigSemendistribution ctPigSemendistribution){
        int result = semenDistributionService.updateAll(ctPigSemendistribution);
        if (result == 0) {
            return ResultUtil.error("更新失败");
        }else {
            return ResultUtil.success("更新成功");
        }
    }
}
