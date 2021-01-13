package dao;

import entity.CtPigSemendose;

/**
 * @Entity entity.CtPigSemendose
 */
public interface CtPigSemendoseDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemendose record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemendose record);

    /**
     * @mbg.generated
     */
    CtPigSemendose selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemendose record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemendose record);
}