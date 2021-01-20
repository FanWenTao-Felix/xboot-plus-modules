package dao;

import entity.CtPigStoragestockingrecord;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigStoragestockingrecord
 */
public interface CtPigStoragestockingrecordDao {
    /**
     * 删除
     * @param fid fid
     * @return 1||0
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigStoragestockingrecord record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigStoragestockingrecord record);

    /**
     * @mbg.generated
     */
    CtPigStoragestockingrecord selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigStoragestockingrecord record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigStoragestockingrecord record);

    /**
     * 查询最近一次盘点记录
     * @param orgId 组织名称
     * @return 记录
     */
    CtPigStoragestockingrecord selectLatest(String orgId);

    /**
     * 入库（精液配置）
     * @param orgId 组织Id
     * @return  number数目
     */
    int selectPeizhitId(String orgId);

    /**
     * 入库（外进记录）
     * @param orgId 组织ID
     * @return 数目
     */
    int SelectWaijin(String orgId);

    /**
     * 入库（调拨入库）
     * @param orgId 组织单元
     * @return number数目
     */
    int selectSpermId(String orgId);

    /**
     * 调拨出库
     * @param orgId 组织单元
     * @return number数目
     */
    int selectSpermOutput(String orgId);

    /**
     * 报销出库
     * @param orgId 组织单元
     * @return number
     */
    int selectBaoXiao(String orgId);

    /**
     * 销售出库
     * @param orgId 组织单元
     * @return number
     */
    int selectSell(String orgId);

    /**
     * 发放出库
     * @param orgId 组织单元
     * @return number
     */
    int selectDistribution(String orgId);

    /**
     * 生成Fid
     * @return fid
     */
    String createFid();

    /**
     * 查询该组织结构下未审核的记录
     * @param orgId 组织结构
     * @return list
     */
    List<CtPigStoragestockingrecord> selectAll(String orgId);
}