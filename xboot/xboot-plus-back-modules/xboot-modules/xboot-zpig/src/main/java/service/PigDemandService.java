package service;

import entity.CtPigDemandapplication;

import java.util.List;

/**
 * @author AIERXUAN
 * 需求申请
 */
public interface PigDemandService {
    /**
     * 查询符合要求的需求申请(审批通过且未完成，申请方式为跨场调拨)
     * @param toOrgId 需求场
     * @param applicationStatus  申请状态
     * @return list
     */
    List<CtPigDemandapplication> selectDeamands(String toOrgId,String applicationStatus);

    /**
     * 查询所有通过需求申请(审批通过，申请方式为跨场调拨)
     * @param toOrgId 需求场
     * @param applicationStatus  申请状态
     * @return list
     */
    List<CtPigDemandapplication> selectAllDeamands(String toOrgId,String applicationStatus);
}
