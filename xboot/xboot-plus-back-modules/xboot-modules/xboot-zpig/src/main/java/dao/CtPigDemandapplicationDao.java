package dao;

import entity.CtPigDemandapplication;

import java.util.List;

/**
 * @Entity entity.CtPigDemandapplication
 */
public interface CtPigDemandapplicationDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigDemandapplication record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigDemandapplication record);

    /**
     * @mbg.generated
     */
    CtPigDemandapplication selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigDemandapplication record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigDemandapplication record);

    /**
     * 查询审批通过且未完成的需求申请单
     * @param toOrgId 需求场
     * @param applicationStatus 需求类型
     * @return list
     */
    List<CtPigDemandapplication> selectByConditions(String toOrgId,String applicationStatus);

    /**
     * 查询审批通过的需求申请单
     * @param toOrgId 需求场
     * @param applicationStatus 需求类型
     * @return list
     */
    List<CtPigDemandapplication> selectAllByConditions(String toOrgId,String applicationStatus);

    /**
     * 更新申请单状态和完成状态
     * @param fid 申请单单据编号
     * @param cfapplicationstatu 申请单状态
     * @param cfcompletionstatus 完成状态
     * @return 1||0
     */
    int updateByPrimaryKey(String fid,String cfapplicationstatu,String cfcompletionstatus);
}