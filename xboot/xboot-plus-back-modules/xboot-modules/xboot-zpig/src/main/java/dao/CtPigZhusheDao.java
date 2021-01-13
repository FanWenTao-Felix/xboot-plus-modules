package dao;

import entity.CtPigZhushe;

import java.util.List;

/**
 * @Entity entity.CtPigZhushe
 */
public interface CtPigZhusheDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigZhushe record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigZhushe record);

    /**
     * @mbg.generated
     */
    CtPigZhushe selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigZhushe record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigZhushe record);

    /**
     * 根据生产线查询猪舍
     * @param shChanLineid 生产线
     * @return lsit
     */
    List<CtPigZhushe> findAllByCfshchanlineid(String shChanLineid);
}