package dao;

import entity.CtPigShchanline;

import java.util.List;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigShchanline
 */
public interface CtPigShchanlineDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigShchanline record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigShchanline record);

    /**
     * @mbg.generated
     */
    CtPigShchanline selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigShchanline record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigShchanline record);

    /**
     * 通过猪场Id查询生产线
     * @param cforgunitId 猪场Id
     * @return list
     */
    List<CtPigShchanline> findByCforgunitId(String cforgunitId);
}