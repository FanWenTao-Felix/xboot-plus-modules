package dao;

import entity.CtPigSemensellrecord;

/**
 * @Entity entity.CtPigSemensellrecord
 */
public interface CtPigSemensellrecordDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemensellrecord record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemensellrecord record);

    /**
     * @mbg.generated
     */
    CtPigSemensellrecord selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemensellrecord record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemensellrecord record);
}