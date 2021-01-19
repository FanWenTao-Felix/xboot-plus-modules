package service;

import entity.CtPigSemendistribution;
import entity.TPmUser;

import java.util.List;

/**
 * @author AIERXUAN
 * 精液发放记录
 */
public interface SemenDistributionService {
    /**
     * 查询所有未被审核的记录
     * @param zhuSheId 猪舍
     * @return list
     */
    List<CtPigSemendistribution> selectAll(String zhuSheId);

    /**
     * 模糊查询
     * @param zhuSheId 猪舍
     * @param name 模糊字段
     * @param startDate 开始按日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSemendistribution> selectByzhuSheId(String zhuSheId, String name, String startDate, String endDate);

    /**
     * 增加新的发放记录
     * @param ctPigSemendistribution 发放记录
     * @return 1||0
     */
    int insert(CtPigSemendistribution ctPigSemendistribution);

    /**
     * 更新审核
     * @param list 批量
     * @param tPmUser 用户
     * @return list
     */
    List<Integer> updateIfAuditing(List<CtPigSemendistribution> list , TPmUser tPmUser);

    /**
     * 删除
     * @param ctPigSemendistribution  记录
     * @return 1||0
     */
    int delByFids(CtPigSemendistribution ctPigSemendistribution);

    /**
     * 编辑更新
     * @param ctPigSemendistribution 记录
     * @return 1||0
     */
    int updateAll(CtPigSemendistribution ctPigSemendistribution);
}
