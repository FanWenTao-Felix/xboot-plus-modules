package service;

import entity.CtPigDemandapplication;

import java.util.List;

/**
 * @author AIERXUAN
 */
public interface DemandApplicationService {
    /**
     * 查询审批完成且未完成的，符合要求的申请
     * @param orgId 组织名称
     * @param statusName 需求类型
     * @return list
     */
    List<CtPigDemandapplication> selectDemandapplication(String orgId , String statusName);

    /**
     * 更新完成状态
     * @param ctPigDemandapplication 需求记录
     * @return 1||0
     */
    int update(CtPigDemandapplication ctPigDemandapplication);
}
