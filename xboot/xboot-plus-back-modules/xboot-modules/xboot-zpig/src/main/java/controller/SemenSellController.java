package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigSemendistribution;
import entity.CtPigSemensellrecord;
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
import service.SemenSellRecordService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "销售记录")
@RequestMapping("/xboot/ZpigManager/SemenSell")
@CacheConfig(cacheNames = "semenSell")
@CrossOrigin
public class SemenSellController {
    private final SemenSellRecordService semenSellRecordService;

    @Autowired
    public SemenSellController(SemenSellRecordService semenSellRecordService) {
        this.semenSellRecordService = semenSellRecordService;
    }

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪场未审核的销售记录")
    public Result< ? > selectAll(String orgId){
        List<CtPigSemensellrecord> list = semenSellRecordService.selectAll(orgId);
        if (list == null) {
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigSemensellrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "selectByOrgId", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询指定猪场未审核的销售记录")
    public Result< ? > selectByOrgId(String zhuSheId, String name, String startDate, String endDate){
        List<CtPigSemensellrecord> list = semenSellRecordService.selectByOrgId(zhuSheId, name, startDate, endDate);
        if (list == null) {
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigSemensellrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiOperation(value = "插入销售记录")
    public Result< ? > insert(CtPigSemensellrecord ctPigSemensellrecord){
        Integer result = semenSellRecordService.insert(ctPigSemensellrecord);
        if (result == null) {
            return ResultUtil.error("插入失败");
        }else {
            return ResultUtil.success("插入成功");
        }
    }

    @RequestMapping(value = "updateIfAuditing", method = RequestMethod.POST)
    @ApiOperation(value = "审核")
    public Result< ? > updateIfAuditing(List<CtPigSemensellrecord> list , TPmUser tPmUser){
        List<Integer> result = semenSellRecordService.updateIfAuditing(list, tPmUser);
        if (result == null || result.size() < list.size()) {
            return ResultUtil.error("审核失败");
        }else {
            return ResultUtil.success("审核成功");
        }
    }

    @RequestMapping(value = "delByFids", method = RequestMethod.POST)
    @ApiOperation(value = "删除")
    public Result< ? > delByFids(CtPigSemensellrecord ctPigSemensellrecord){
        String fid = ctPigSemensellrecord.getFid();
        int result = semenSellRecordService.delByFid(fid);
        if (result == 0) {
            return ResultUtil.error("删除失败");
        }else {
            return ResultUtil.success("删除成功");
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public Result< ? > update(CtPigSemensellrecord ctPigSemensellrecord){
        int result = semenSellRecordService.update(ctPigSemensellrecord);
        if (result == 0) {
            return ResultUtil.error("更新失败");
        }else {
            return ResultUtil.success("更新成功");
        }
    }
}
