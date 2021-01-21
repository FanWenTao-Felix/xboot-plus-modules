package controller;

import cn.exrick.xboot.core.common.utils.ResultUtil;
import cn.exrick.xboot.core.common.vo.Result;
import entity.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.*;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@RestController
@Api(description = "帮助工具")
@RequestMapping("/xboot/ZpigManager/MdUtil")
@CacheConfig(cacheNames = "MdUtil")
@CrossOrigin
public class MdUtilController {
    private final WeekHaoService weekHaoService;
    private final CompleteStatusService completeStatusService;
    private final ShenChanLineService shenChanLineService;
    private final ZhuSheService zhuSheService;
    private final TBdPersonService tBdPersonService;
    private final ZPigFlkService zPigFlkService;
    private final SemenCollectionService semenCollectionService;
    private final MaterialService materialService;
    private final DemandApplicationService demandApplicationService;

    @Autowired
    public MdUtilController(WeekHaoService weekHaoService, CompleteStatusService completeStatusService, ShenChanLineService shenChanLineService, ZhuSheService zhuSheService, TBdPersonService tBdPersonService, ZPigFlkService zPigFlkService, SemenCollectionService semenCollectionService, MaterialService materialService, DemandApplicationService demandApplicationService) {
        this.weekHaoService = weekHaoService;
        this.completeStatusService = completeStatusService;
        this.shenChanLineService = shenChanLineService;
        this.zhuSheService = zhuSheService;
        this.tBdPersonService = tBdPersonService;
        this.zPigFlkService = zPigFlkService;
        this.semenCollectionService = semenCollectionService;
        this.materialService = materialService;
        this.demandApplicationService = demandApplicationService;
    }

    @RequestMapping(value = "selectWeekHao", method = RequestMethod.GET)
    @ApiOperation(value = "生成周号")
    public Result<String> selectWeekHao(){
        String weekHao = weekHaoService.selectWeekHao();
        if (weekHao == null) {
            return ResultUtil.error("错误，未查询到周号");
        }else {
            return new ResultUtil<String>().setData(weekHao);
        }
    }

    @RequestMapping(value = "selectComplete", method = RequestMethod.GET)
    @ApiOperation(value = "查询完成状态")
    public Result<List<CtPigCompletestatus>> selectComplete(){
        List<CtPigCompletestatus> list = completeStatusService.selectAll();
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigCompletestatus>>().setData(list);
        }
    }

    @RequestMapping(value = "selectShenChanLine", method = RequestMethod.GET)
    @ApiOperation(value = "查询生产线")
    public Result<List<CtPigShchanline>> selectShenChanLine(String orgUnit){
        List<CtPigShchanline> list = shenChanLineService.findByCforgunitId(orgUnit);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigShchanline>>().setData(list);
        }
    }

    @RequestMapping(value = "selectZhuShe", method = RequestMethod.GET)
    @ApiOperation(value = "查询猪舍")
    public Result<List<CtPigZhushe>> selectZhuShe(String shChanLineid){
        List<CtPigZhushe> list = zhuSheService.findAllByCfshchanlineid(shChanLineid);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigZhushe>>().setData(list);
        }
    }
    
    @RequestMapping(value = "selectByName", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询采精员")
    public Result<List<TBdPerson>> selectByName(String name){
        List<TBdPerson> list = tBdPersonService.selectByName(name);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<TBdPerson>>().setData(list);
        }
    }

    @RequestMapping(value = "selectByCfzhusheid", method = RequestMethod.GET)
    @ApiOperation(value = "根据猪舍查询种猪档案")
    public Result<List<CtPigZpigflk>> selectByCfzhusheid(String zhuSheId){
        List<CtPigZpigflk> list = zPigFlkService.selectByCfzhusheid(zhuSheId);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigZpigflk>>().setData(list);
        }
    }

    @RequestMapping(value = "selectByCfzhusheid", method = RequestMethod.GET)
    @ApiOperation(value = "根据耳号查询记录")
    public Result<CtPigZpigflk> selectByErHao(String erHao){
        CtPigZpigflk list = zPigFlkService.selectByErHao(erHao);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<CtPigZpigflk>().setData(list);
        }
    }

    @RequestMapping(value = "selectByCollectors", method = RequestMethod.GET)
    @ApiOperation(value = "查询采精员名下的采集计划")
    public Result<List<CtPigSemencollection>> selectByCollectors(String executorID){
        List<CtPigSemencollection> list = semenCollectionService.selectByCollectors(executorID);
        if (list == null) {
            return ResultUtil.error("查询出错");
        }else {
            return new ResultUtil<List<CtPigSemencollection>>().setData(list);
        }
    }

    @RequestMapping(value = "selectTBdMaterial", method = RequestMethod.GET)
    @ApiOperation(value = "查询品种")
    public Result<TBdMaterial> selectTBdMaterial(String fid){
        TBdMaterial tBdMaterial = materialService.selectByPrimaryKey(fid);
        if (tBdMaterial == null) {
            return ResultUtil.error("查询无结果");
        }else {
            return new ResultUtil<TBdMaterial>().setData(tBdMaterial);
        }
    }

    @RequestMapping(value = "selectDemandApplication", method = RequestMethod.GET)
    @ApiOperation(value = "查询发放申请")
    public Result< ? > selectDemandApplication(String orgId){
        String  statusName = "本场申请";
        List<CtPigDemandapplication> list = demandApplicationService.selectDemandapplication( orgId , statusName);
        if (list == null) {
            return ResultUtil.error("查询无结果");
        }else {
            return new ResultUtil< List<CtPigDemandapplication>>().setData(list);
        }
    }

    @RequestMapping(value = "selectSellApplication", method = RequestMethod.GET)
    @ApiOperation(value = "查询销售申请")
    public Result< ? > selectSellApplication(String orgId){
        String  statusName = "跨集团申请";
        List<CtPigDemandapplication> list = demandApplicationService.selectDemandapplication( orgId , statusName);
        if (list == null) {
            return ResultUtil.error("查询无结果");
        }else {
            return new ResultUtil< List<CtPigDemandapplication>>().setData(list);
        }
    }
}
