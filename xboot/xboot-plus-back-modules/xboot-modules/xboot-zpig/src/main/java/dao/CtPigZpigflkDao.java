package dao;

import entity.CtPigZpigflk;

import java.util.List;

/**
 * @Entity entity.CtPigZpigflk
 */
public interface CtPigZpigflkDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigZpigflk record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigZpigflk record);

    /**
     * @mbg.generated
     */
    CtPigZpigflk selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigZpigflk record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigZpigflk record);

    /**
     * 查询种猪档案
     * @param zhuSheid 猪舍
     * @return list
     */
    List<CtPigZpigflk> selectByCfzhusheid(String zhuSheid);
}