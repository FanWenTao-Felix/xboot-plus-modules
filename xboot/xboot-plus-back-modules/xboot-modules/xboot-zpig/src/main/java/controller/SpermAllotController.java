package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigDemandapplication;
import entity.CtPigSpermallotrecord;
import entity.TPmUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.SpermRecordService;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 */

@Slf4j
@RestController
@Api(description = "调拨记录")
@RequestMapping("/xboot/ZpigManager/SpermAllot")
@CacheConfig(cacheNames = "spermAllot")
@CrossOrigin
public class SpermAllotController {
    private final SpermRecordService spermRecordService;

    @Autowired
    public SpermAllotController(SpermRecordService spermRecordService) {
        this.spermRecordService = spermRecordService;
    }

    @RequestMapping(value = "selectDemand", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪场下符合要求的需求申请")
    public Result<List<CtPigDemandapplication>> selectDemand(String orgId){
        List<CtPigDemandapplication> list = spermRecordService.selectDemand(orgId);
        if (list == null) {
            return ResultUtil.error("未查到需求声请");
        }else if (list.size() == 0) {
            return ResultUtil.success("需求为0");
        }else {
            return new ResultUtil<List<CtPigDemandapplication>>().setData(list);
        }
    }

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询未被审核的调拨记录")
    public Result<List<CtPigSpermallotrecord>> selectAll(String applicationId){
        List<CtPigSpermallotrecord> list = spermRecordService.selectAllRecord(applicationId);
        if (list == null){
            return ResultUtil.error("查询调拨记录错误");
        }else {
            return new ResultUtil<List<CtPigSpermallotrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "selectPuzzy", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询")
    public Result<List<CtPigSpermallotrecord>> selectPuzzy(String applicationId,String name){
        List<CtPigSpermallotrecord> list = spermRecordService.selectPuzzy(applicationId, name);
        if (list == null){
            return ResultUtil.error("模糊查询调拨记录错误");
        }else {
            return new ResultUtil<List<CtPigSpermallotrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "selectSpermallotrecord", method = RequestMethod.GET)
    @ApiOperation(value = "按日期查询")
    public Result<List<CtPigSpermallotrecord>> selectSpermallotrecord(String appId, Date start, Date end){
        List<CtPigSpermallotrecord> list = spermRecordService.selectSpermallotrecord(appId, start, end);
        if (list == null){
            return ResultUtil.error("按日期查询调拨记录错误");
        }else {
            return new ResultUtil<List<CtPigSpermallotrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "insertSpermRecord", method = RequestMethod.POST)
    @ApiOperation(value = "插入调拨记录")
    public Result<Integer> insertSpermRecord(CtPigSpermallotrecord ctPigSpermallotrecord){
        Integer result = spermRecordService.insertSpermRecord(ctPigSpermallotrecord);
        if (result == 1) {
            return ResultUtil.success("插入成功");
        }else {
            return ResultUtil.error("插入失败");
        }
    }

    @RequestMapping(value = "deleteSpermRecord", method = RequestMethod.POST)
    @ApiOperation(value = "删除调拨记录")
    public Result<Integer> deleteSpermRecord(@NotNull CtPigSpermallotrecord ctPigSpermallotrecord){
        String fid = ctPigSpermallotrecord.getFid();
        Integer result = spermRecordService.deleteSpermRecord(fid);
        if (result == 1) {
            return ResultUtil.success("删除成功");
        }else {
            return ResultUtil.error("删除失败");
        }
    }

    @RequestMapping(value = "updateSpermRecord", method = RequestMethod.POST)
    @ApiOperation(value = "更新调拨记录")
    public Result<Integer> updateSpermRecord(CtPigSpermallotrecord ctPigSpermallotrecord){
        int result = spermRecordService.updateSpermRecord(ctPigSpermallotrecord);
        if (result == 1) {
            return ResultUtil.success("更新成功");
        }else {
            return ResultUtil.error("更新失败");
        }
    }



    @RequestMapping(value = "audit", method = RequestMethod.POST)
    @ApiOperation(value = "审核")
    public Result<List<Integer>> audit(List<CtPigSpermallotrecord> ctPigSpermallotrecords, TPmUser tPmUser){
        List<Integer> list = spermRecordService.audit(ctPigSpermallotrecords, tPmUser);
        if (list == null || list.size() < ctPigSpermallotrecords.size()) {
            return ResultUtil.error("审核失败");
        }else {
            return ResultUtil.success("审核成功");
        }
    }
}
