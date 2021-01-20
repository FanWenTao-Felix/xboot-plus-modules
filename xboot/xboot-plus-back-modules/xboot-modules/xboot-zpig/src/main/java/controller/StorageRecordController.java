package controller;


import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigStoragesre;
import entity.CtPigStoragestockingrecord;
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
import service.StorageService;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "组织单元")
@RequestMapping("/xboot/ZpigManager/StorageRecord")
@CacheConfig(cacheNames = "storageRecord")
@CrossOrigin
public class StorageRecordController {
    private final StorageService storageService;

    @Autowired
    public StorageRecordController(StorageService storageService) {
        this.storageService = storageService;
    }

    @RequestMapping(value = "selectByOrgId", method = RequestMethod.GET)
    @ApiOperation(value = "查询最近一次盘点记录")
    public Result<CtPigStoragestockingrecord> selectByOrgId(@NotNull String orgId){
        CtPigStoragestockingrecord ctPigStoragestockingrecord = storageService.selectLatedNumber(orgId);
        if (ctPigStoragestockingrecord == null) {
            return ResultUtil.error("没有查到最近记录");
        }else {
            return new ResultUtil<CtPigStoragestockingrecord>().setData(ctPigStoragestockingrecord);
        }
    }

    @RequestMapping(value = "selectTheoryNumber", method = RequestMethod.GET)
    @ApiOperation(value = "查询理论数量")
    public Result<Integer> selectTheoryNumber(String orgId){
        Integer theoryNumber = storageService.selectTheoryNumber(orgId);
        if (theoryNumber == null) {
            return ResultUtil.error("没有查到理论数量");
        }else {
            return new ResultUtil<Integer>().setData(theoryNumber);
        }
    }

    @RequestMapping(value = "insertMain", method = RequestMethod.POST)
    @ApiOperation(value = "插入主表")
    public Result<?> insertMain(@org.jetbrains.annotations.NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord){
        Integer result = storageService.insertRecord(ctPigStoragestockingrecord);
        if (result == null || result.equals(0) ) {
            return ResultUtil.error("插入主表失败");
        }else {
            return ResultUtil.success("插入主表成功");
        }
    }

    @RequestMapping(value = "selectCtPigStoragesre", method = RequestMethod.POST)
    @ApiOperation(value = "插入理论记录")
    public Result<?> selectByParentId(@org.jetbrains.annotations.NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord){
        String partentId = ctPigStoragestockingrecord.getFid();
        List<Integer> list = storageService.selectByParentId(partentId);
        if (list.size() > 0) {
            return ResultUtil.success("插入附表成功");
        }else {
            return ResultUtil.error("插入附表失败");
        }
    }

    @RequestMapping(value = "insertEntry", method = RequestMethod.POST)
    @ApiOperation(value = "插入单条盘点记录")
    public Result<?> insertEntry(@org.jetbrains.annotations.NotNull CtPigStoragesre ctPigStoragesre , @org.jetbrains.annotations.NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord){
        Integer result = storageService.insertEntry(ctPigStoragesre, ctPigStoragestockingrecord);
        if (result == null && result.equals(0)) {
            return ResultUtil.error("插入附表失败");
        }else {
            return ResultUtil.success("插入附表成功");
        }
    }

    @RequestMapping(value = "selectEntry", method = RequestMethod.GET)
    @ApiOperation(value = "查询盘点记录")
    public Result<List<CtPigStoragesre>> selectEntry(@org.jetbrains.annotations.NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord){
        List<CtPigStoragesre> list = storageService.selectEntry(ctPigStoragestockingrecord.getFid());
        if (list.size() == 0 || list.isEmpty()) {
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigStoragesre>>().setData(list);
        }
    }

    @RequestMapping(value = "selectByName", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询盘点记录")
    public Result<List<CtPigStoragesre>> selectByName(String parentId, String name, Date beforeDate, Date endDate){
        List<CtPigStoragesre> list = storageService.selectByName(parentId, name, beforeDate, endDate);
        if (list.size() == 0 || list.isEmpty()) {
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigStoragesre>>().setData(list);
        }
    }

    @RequestMapping(value = "updateEntry", method = RequestMethod.POST)
    @ApiOperation(value = "更新盘点记录")
    public Result<Integer> updateEntry(CtPigStoragesre ctPigStoragesre){
        Integer result = storageService.updateEntry(ctPigStoragesre);
        if (result == null || result == 0) {
            return ResultUtil.error("审核失败");
        }else {
            return ResultUtil.success("更新成功");
        }
    }

    @RequestMapping(value = "updateIfAuditing", method = RequestMethod.POST)
    @ApiOperation(value = "审核")
    public Result<Integer> updateIfAuditing(CtPigStoragestockingrecord ctPigStoragestockingrecord, TPmUser tPmUser){
        Integer result = storageService.updateIfAuditing(ctPigStoragestockingrecord, tPmUser);
        if (result == null || result == 0) {
            return ResultUtil.error("审核失败");
        }else {
            return new ResultUtil<Integer>().setData(result);
        }
    }
}
