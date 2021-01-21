package service;

import entity.CtPigSemenreimburserecoed;
import entity.TPmUser;

import java.util.List;

/**
 * @author AIERXUAN
 * 报销
 */
public interface SemenReimbursedService {
    /**
     * 查询所有未审核的记录
     * @param zhuSheId 猪舍
     * @return list
     */
    List<CtPigSemenreimburserecoed> selectAll(String zhuSheId);

    /**
     * 插入新的记录
     * @param ctPigSemenreimburserecoed 精液报销记录
     * @return 1||0
     */
    int insert(CtPigSemenreimburserecoed ctPigSemenreimburserecoed);

    /**
     * 审核
     * @param records 记录
     * @param tPmUser 用户
     * @return List 1||0
     */
    List<Integer> update(List<CtPigSemenreimburserecoed> records , TPmUser tPmUser);

    /**
     * 条件查询
     * @param zhuSheId 猪舍
     * @param name 名称
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSemenreimburserecoed> selectByCondition(String zhuSheId,String name,String startDate,String endDate);

    /**
     * 删除未审核的报销记录
     * @param fid fid
     * @return 1||0
     */
    int deleteByPrimaryKey(String fid);

    /**
     * 修改未审核的记录
     * @param ctPigSemenreimburserecoed fid
     * @return 1||0
     */
    int updateByCondition(CtPigSemenreimburserecoed ctPigSemenreimburserecoed);

}
