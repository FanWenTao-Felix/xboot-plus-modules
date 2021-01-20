package service;

import entity.CtPigStoragesre;
import entity.CtPigStoragestockingrecord;
import entity.TPmUser;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 * 库存盘点
 */
public interface StorageService {
    /**
     * 查询上次盘点数目
     * @param orgId 组织Id
     * @return Integer
     */
    CtPigStoragestockingrecord selectLatedNumber(String orgId);

    /**
     * 查询理论数目
     * @param orgId 组织单元
     * @return Integer
     */
    Integer selectTheoryNumber(String orgId);

    /**
     * 查询库存,显示理论存在的，方便用户操作
     * @param parentID 主表Id
     * @return list
     */
    List<Integer> selectByParentId(String parentID);

    /**
     * 审核
     * @param ctPigStoragestockingrecord 盘点主表
     * @param tPmUser 用户
     * @return 1||0
     */
    Integer updateIfAuditing(CtPigStoragestockingrecord ctPigStoragestockingrecord, TPmUser tPmUser);

    /**
     * 新增主表
     * @param ctPigStoragestockingrecord 盘点主单
     * @return 1||0
     */
    Integer insertRecord(CtPigStoragestockingrecord ctPigStoragestockingrecord);

    /**
     * 新增副表
     * @param ctPigStoragesre Entry
     * @return 1||0
     */
    Integer insertEntry( CtPigStoragesre ctPigStoragesre , CtPigStoragestockingrecord ctPigStoragestockingrecord);

    /**
     * 模糊查询
     * @param parentId 主表fid
     * @param name 模糊
     * @param beforeDate 开始
     * @param endDate 结束
     * @return list
     */
    List<CtPigStoragesre> selectByName(String parentId, String name, Date beforeDate, Date endDate);

    /**
     * 查询记录
     * @param parentId 主表
     * @return list
     */
    List<CtPigStoragesre> selectEntry(String parentId);

    /**
     * 删除附表
     * @param fid 附表FId
     * @return 1||0
     */
    Integer deleteByEntryId(String fid);

    /**
     * 跟新
     * @param ctPigStoragesre 更新
     * @return 1||0
     */
    Integer updateEntry(CtPigStoragesre ctPigStoragesre);
}
