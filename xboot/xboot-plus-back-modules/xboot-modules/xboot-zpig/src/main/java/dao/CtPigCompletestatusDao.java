package dao;

import entity.CtPigCompletestatus;

import java.util.List;

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

    /**
     * 查询所有
     * @return list
     */
    List<CtPigCompletestatus> selectAll();
}