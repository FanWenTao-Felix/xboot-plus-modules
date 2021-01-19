package dao;

import entity.CtPigJinyearchives;

import java.util.List;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigJinyearchives
 */
public interface CtPigJinyearchivesDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigJinyearchives record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigJinyearchives record);

    /**
     * @mbg.generated
     */
    CtPigJinyearchives selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigJinyearchives record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigJinyearchives record);

    /**
     * 更新精液档案为使用
     * @param fid 档案编号
     * @return 1||0
     */
    int updateIfUsed(String fid);

    /**
     * 根据精液编号和库存组织更新为已报销
     * @param semenNumber 精液编号
     * @param orgUnit   组织单元
     * @return 1||0
     */
    int updateIfReimbursed(String semenNumber,String orgUnit);

    /**
     * 获取新的fid
     * @return fid
     */
    String createFid();

    /**
     * 获取精液档案
     * @param earNumber 耳号
     * @return list
     */
    List<CtPigJinyearchives> selectByConditions(String earNumber);

    /**
     * 根据精液编号查询
     * @param semenNumber 精液编号
     * @return list
     */
    List<CtPigJinyearchives> selectByNumber(String semenNumber);
}