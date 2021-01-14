package dao;

import entity.CtPigApplicationstatus;

/**
 * @Entity entity.CtPigApplicationstatus
 */
public interface CtPigApplicationstatusDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigApplicationstatus record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigApplicationstatus record);

    /**
     * @mbg.generated
     */
    CtPigApplicationstatus selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigApplicationstatus record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigApplicationstatus record);
}