package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.CtPigSemenreimburserecoed;
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
import service.SemenReimbursedService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "报销记录")
@RequestMapping("/xboot/ZpigManager/Reimburse")
@CacheConfig(cacheNames = "reimburse")
@CrossOrigin
public class ReimburseController {
    private final SemenReimbursedService semenReimbursedService;

    @Autowired
    public ReimburseController(SemenReimbursedService semenReimbursedService) {
        this.semenReimbursedService = semenReimbursedService;
    }

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询指定猪舍下未审核的报销记录")
    public Result<List<CtPigSemenreimburserecoed>> selectAll(String zhuSheId){
        List<CtPigSemenreimburserecoed> list = semenReimbursedService.selectAll(zhuSheId);
        if (list == null){
            return ResultUtil.error("查询报销记录错误");
        }else {
            return new ResultUtil<List<CtPigSemenreimburserecoed>>().setData(list);
        }
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiOperation(value = "插入未审核的报销记录")
    public Result<?> insert(CtPigSemenreimburserecoed ctPigSemenreimburserecoed){
        Integer result = semenReimbursedService.insert(ctPigSemenreimburserecoed);
        if (result != 1){
            return ResultUtil.error("插入失败");
        }else {
            return ResultUtil.success("插入成功");
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "审核报销记录")
    public Result<List<Integer>> update(List<CtPigSemenreimburserecoed> records , TPmUser tPmUser){
        List<Integer> list = semenReimbursedService.update(records, tPmUser);
        if (list == null && list.size() < records.size()){
            return ResultUtil.error("审核失败");
        }else {
            return ResultUtil.success("审核成功");
        }
    }

    @RequestMapping(value = "selectByCondition", method = RequestMethod.GET)
    @ApiOperation(value = "条件查询")
    public Result<List<CtPigSemenreimburserecoed>> selectByCondition(String zhuSheId,String name,String startDate,String endDate){
        List<CtPigSemenreimburserecoed> list = semenReimbursedService.selectByCondition(zhuSheId, name, startDate, endDate);
        if (list == null){
            return ResultUtil.error("查询失败");
        }else {
            return new ResultUtil<List<CtPigSemenreimburserecoed>>().setData(list);
        }
    }

    @RequestMapping(value = "deleteByPrimaryKey", method = RequestMethod.POST)
    @ApiOperation(value = "删除未审核的报销记录")
    public Result<?> deleteByPrimaryKey(String fid){
        int result = semenReimbursedService.deleteByPrimaryKey(fid);
        if (result != 1) {
            return ResultUtil.error("删除失败");
        }else {
            return ResultUtil.success("删除成功");
        }
    }

    @RequestMapping(value = "updateByCondition", method = RequestMethod.POST)
    @ApiOperation(value = "修改未审核的报销记录")
    public Result<?> updateByCondition(CtPigSemenreimburserecoed ctPigSemenreimburserecoed){
        int result = semenReimbursedService.updateByCondition(ctPigSemenreimburserecoed);
        if (result != 1) {
            return ResultUtil.error("修改失败");
        }else {
            return ResultUtil.success("修改成功");
        }
    }
}
