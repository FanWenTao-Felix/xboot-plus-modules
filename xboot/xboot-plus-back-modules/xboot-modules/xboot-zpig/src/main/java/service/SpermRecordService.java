package service;


import entity.CtPigDemandapplication;
import entity.CtPigSpermallotrecord;
import entity.TPmUser;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 * 精液调拨相关
 */
public interface SpermRecordService {
    /**
     * 查询调拨需求申请
     * @param orgId 组织单元
     * @return list
     */
    List<CtPigDemandapplication> selectDemand(String orgId);

    /**
     * 查询所有调拨需求申请
     * @param orgId 组织单元
     * @return list
     */
    List<CtPigDemandapplication> selectAllDemand(String orgId);

    /**
     * 插入调拨记录
     * @param ctPigSpermallotrecord 调拨记录
     * @return 1||0
     */
    int insertSpermRecord(CtPigSpermallotrecord ctPigSpermallotrecord);

    /**
     * 删除调拨记录
     * @param fid Id
     * @return 1||0
     */
    int deleteSpermRecord(String fid);

    /**
     * 更新调拨记录
     * @param ctPigSpermallotrecord 调拨记录
     * @return 1||0
     */
    int updateSpermRecord(CtPigSpermallotrecord ctPigSpermallotrecord);

    /**
     * 查询所有记录
     * @param applicationId 需求
     * @return list
     */
    List<CtPigSpermallotrecord> selectAllRecord(String applicationId);

    /**
     * 根据日期查询调拨记录
     * @param start 开始日期
     * @param end 结束日期
     * @param appId 需求申请
     * @return list
     */
    List<CtPigSpermallotrecord> selectSpermallotrecord(String appId,Date start,Date end);

    /**
     * 模糊查询
     * @param name 参数
     * @return  list
     */
    List<CtPigSpermallotrecord> selectPuzzy(String orgId,String name);

    /**
     * 批量审批
     * @param ctPigSpermallotrecords 调拨记录
     * @return list
     */
    List<Integer> audit(List<CtPigSpermallotrecord> ctPigSpermallotrecords, TPmUser tPmUser);
}
