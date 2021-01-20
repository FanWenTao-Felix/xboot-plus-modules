package dao;

import entity.CtPigStoragesre;

import java.util.Date;
import java.util.List;

/**
 * @Entity entity.CtPigStoragesre
 */
public interface CtPigStoragesreDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigStoragesre record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigStoragesre record);

    /**
     * @mbg.generated
     */
    CtPigStoragesre selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigStoragesre record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigStoragesre record);

    /**
     * 根据主表Fid查询所有
     * @param parentId 主表fid
     * @return list
     */
    List<CtPigStoragesre> selectByFparentids(String parentId);

    /**
     * 创建Fid
     * @return string
     */
    String createFid();

    /**
     * 模糊查询
     * @param parentId 主表
     * @param name  模糊
     * @param beforeDate 开始日期
     * @param endDate   结束日期
     * @return list
     */
    List<CtPigStoragesre> selectByConditions(String parentId, String name, Date beforeDate, Date endDate);
}