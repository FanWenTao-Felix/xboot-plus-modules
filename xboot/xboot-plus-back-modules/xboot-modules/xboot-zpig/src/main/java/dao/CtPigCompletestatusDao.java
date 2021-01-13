package dao;

import entity.CtPigCompletestatus;

/**
 * @Entity entity.CtPigCompletestatus
 */
public interface CtPigCompletestatusDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigCompletestatus record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigCompletestatus record);

    /**
     * @mbg.generated
     */
    CtPigCompletestatus selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigCompletestatus record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigCompletestatus record);
}