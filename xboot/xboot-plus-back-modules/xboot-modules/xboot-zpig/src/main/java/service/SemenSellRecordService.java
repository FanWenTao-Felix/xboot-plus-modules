package service;

import entity.CtPigSemensellrecord;
import entity.TPmUser;

import java.util.List;

/**
 * @author AIERXUAN
 */
public interface SemenSellRecordService {
    /**
     * 获取所有未被审核的记录
     * @param orgId 猪舍
     * @return list
     */
    List<CtPigSemensellrecord> selectAll(String orgId);

    /**
     * 模糊查询
     * @param orgId 猪场
     * @param name 模糊字段
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSemensellrecord> selectByOrgId(String orgId , String name, String startDate, String endDate);

    /**
     * 新增
     * @param ctPigSemensellrecord 销售记录
     * @return 1||0
     */
    int insert(CtPigSemensellrecord ctPigSemensellrecord);

    /**
     * 更新审核
     * @param list 记录
     * @param tPmUser 用户
     * @return list
     */
    List<Integer> updateIfAuditing(List<CtPigSemensellrecord> list , TPmUser tPmUser);

    /**
     * 删除
     * @param fid fid
     * @return 1||0
     */
    int delByFid(String fid);

    /**
     * 编辑更新
     * @param ctPigSemensellrecord 记录
     * @return 1||0
     */
    int update(CtPigSemensellrecord ctPigSemensellrecord);
}
