package dao;

import entity.CtPigSemenreimburserecoed;

import java.util.List;

/**
 * @Entity entity.CtPigSemenreimburserecoed
 */
public interface CtPigSemenreimburserecoedDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemenreimburserecoed record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemenreimburserecoed record);

    /**
     * @mbg.generated
     */
    CtPigSemenreimburserecoed selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemenreimburserecoed record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemenreimburserecoed record);

    /**
     * 查询未审核、未使用且未报销的记录
     * @param zhuSheId 组织单元Id
     * @param name 模糊查询参数
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSemenreimburserecoed> selectByOrgId(String zhuSheId,String name,String startDate,String endDate);

    /**
     * 查询数据库中是否已存在当前精液
     * @param semenNumber 精液编号
     * @return list
     */
    List<CtPigSemenreimburserecoed> selectBySemenNumber(String semenNumber);

    /**
     * 查询所有未审核的精液报销记录
     * @param zhuSheId 猪舍
     * @return list
     */
    List<CtPigSemenreimburserecoed> selectAll(String zhuSheId);

    /**
     * 创造FID
     * @return string
     */
    String createFid();
}