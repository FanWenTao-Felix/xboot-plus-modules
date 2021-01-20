package service;

import entity.CtPigJinyearchives;

import java.util.List;

/**
 * @author AIERXUAN
 * 精液档案
 */
public interface JinyeArchivesService {
    /**
     * 精液状态更新为已使用
     * @param fid 精液档案编号
     * @return 1||0
     */
    int updateIfUsed(String fid);

    /**
     * 插入新的精液档案记录
     * @param ctPigJinyearchives 精液档案
     * @return 1||0
     */
    int insertArchive(CtPigJinyearchives ctPigJinyearchives);

    /**
     * 查询公猪所有符合要求的精液档案
     * @param earNumber 耳号
     * @return list
     */
    List<CtPigJinyearchives> selectByConditions(String earNumber);

    /**
     * 查询当前猪舍下符合要求的精液档案
     * @param orgId orgId
     * @return list
     */
    List<CtPigJinyearchives> selectByOrg(String orgId);

    /**
     * 查询档案信息
     * @param fid fid
     * @return CtPigJinyearchives
     */
    CtPigJinyearchives selectByPrimary(String fid);

    /**
     * 根据精液编号查询精液档案
     * @param semenNumber 精液编号
     * @return list
     */
    List<CtPigJinyearchives> selectByNumbers(String semenNumber);

    /**
     * 模糊查询精液档案
     * @param key 主键
     * @return 精液档案
     */
    CtPigJinyearchives selectByPrimaryKey(String key);

    /**
     * 新建fid
     * @return fid
     */
    String createFid();
}
