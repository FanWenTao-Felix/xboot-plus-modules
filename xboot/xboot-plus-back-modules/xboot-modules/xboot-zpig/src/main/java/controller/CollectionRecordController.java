package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigCollectionrecord;
import entity.TPmUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.CollectionRecordService;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@Controller
@Api(description = "采集记录")
@RequestMapping("/xboot/ZpigManager/CollectionRecord")
@CacheConfig(cacheNames = "collectionRecord")
@CrossOrigin
public class CollectionRecordController {
    private final CollectionRecordService collectionRecordService;

    @Autowired
    public CollectionRecordController(CollectionRecordService collectionRecordService) {
        this.collectionRecordService = collectionRecordService;
    }

    @RequestMapping(value = "intervalDays", method = RequestMethod.GET)
    @ApiOperation(value = "根据耳号计算间隔天数")
    public Result<?> intervalDays(String earNumber){
        Integer days = collectionRecordService.intervalDays(earNumber);
        if ( days == null || days.equals("")){
            return ResultUtil.error("计算间隔天数出错");
        }else {
            return new ResultUtil<Integer>().setData(days);
        }
    }
    
    @RequestMapping(value = "insertCollectionRecord", method = RequestMethod.POST)
    @ApiOperation(value = "插入采集记录")
    public Result<?> insertCollectionRecord(CtPigCollectionrecord record){
        Integer result = collectionRecordService.insertCollectionRecord(record);
        if (result == null) {
            return ResultUtil.error("插入出错");
        }else {
            return ResultUtil.success("插入成功");
        }
    }

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询当前猪舍未审核的采集记录")
    public Result<?> selectAll(String zhuSheId){
        List<CtPigCollectionrecord> list = collectionRecordService.selectAll(zhuSheId);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigCollectionrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "updateIfAufits", method = RequestMethod.POST)
    @ApiOperation(value = "审核")
    public Result< ? > updateIfAufits(List<CtPigCollectionrecord> records, TPmUser TPmUser) {
        List<Integer> list = collectionRecordService.updateIfAufits(records, TPmUser);
        if (list == null || list.size() < records.size()) {
            return ResultUtil.error("审核出错");
        }else {
            return new ResultUtil<List<Integer>>().setData(list);
        }
    }

    @RequestMapping(value = "deleteCollectionRecord", method = RequestMethod.POST)
    @ApiOperation(value = "删除")
    public Result< ? > deleteCollectionRecord(String fId){
        Integer result = collectionRecordService.deleteCollectionRecord(fId);
        if (result == null) {
            return ResultUtil.error("删除出错");
        }else {
            return ResultUtil.success("删除成功");
        }
    }

    @RequestMapping(value = "updateCollectionRecord", method = RequestMethod.POST)
    @ApiOperation(value = "更新")
    public Result< ? > updateCollectionRecord(CtPigCollectionrecord record){
        Integer result = collectionRecordService.updateCollectionRecord(record);
        if (result == null) {
            return ResultUtil.error("更新出错");
        }else {
            return ResultUtil.success("更新成功");
        }
    }

    @RequestMapping(value = "selectSelective", method = RequestMethod.GET)
    @ApiOperation(value = "条件查询采集记录")
    public Result<?> selectSelective(String zhuSheId , String selection){
        List<CtPigCollectionrecord> list = collectionRecordService.selectSelective(zhuSheId, selection);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigCollectionrecord>>().setData(list);
        }
    }

    @RequestMapping(value = "selectByDate", method = RequestMethod.GET)
    @ApiOperation(value = "按日期查询采集记录")
    public Result<?> selectByDate(String zhuSheId , Date startDate, Date endDate){
        List<CtPigCollectionrecord> list = collectionRecordService.selectByDate(zhuSheId, startDate, endDate);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigCollectionrecord>>().setData(list);
        }
    }
}
