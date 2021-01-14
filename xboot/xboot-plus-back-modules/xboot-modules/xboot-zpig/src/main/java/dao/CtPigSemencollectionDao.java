package dao;

import entity.CtPigSemencollection;

import java.util.List;

/**
 * @Entity entity.CtPigSemencollection
 */
public interface CtPigSemencollectionDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemencollection record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemencollection record);

    /**
     * @mbg.generated
     */
    CtPigSemencollection selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemencollection record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemencollection record);

    /**
     * 查询指定采精员名下所有未完成的采集计划
     * @param executorID 采精员Id
     * @return list
     */
    List<CtPigSemencollection> selectAll(String executorID);

    /**
     * 更新计划状态
     * @param fid 编号
     * @return
     */
    int updatDesign(String fid);
}
