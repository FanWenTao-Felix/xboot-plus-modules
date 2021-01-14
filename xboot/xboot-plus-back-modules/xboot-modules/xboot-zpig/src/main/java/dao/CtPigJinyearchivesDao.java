package dao;

import entity.CtPigJinyearchives;

/**
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
}