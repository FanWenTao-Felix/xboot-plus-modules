package dao;

import entity.CtPigSemensellrecord;

import java.util.List;

/**
 * @Entity entity.CtPigSemensellrecord
 */
public interface CtPigSemensellrecordDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemensellrecord record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemensellrecord record);

    /**
     * @mbg.generated
     */
    CtPigSemensellrecord selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemensellrecord record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemensellrecord record);

    /**
     * 新建一个Fid
     * @return string
     */
    String createFid();

    /**
     * 查询所有未被审核的精液销售记录
     * @param orgId 猪场
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


}