package dao;

import entity.CtPigSemendistribution;

import java.util.List;

/**
 * @Entity entity.CtPigSemendistribution
 */
public interface CtPigSemendistributionDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemendistribution record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemendistribution record);

    /**
     * @mbg.generated
     */
    CtPigSemendistribution selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemendistribution record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemendistribution record);

    /**
     * 查询该猪舍下所有未审核的发放记录
     * @param zhuSheId 猪舍
     * @return list
     */
    List<CtPigSemendistribution> selectAll(String zhuSheId);

    /**
     * 查询未审核、未使用且未报销的记录
     * @param zhuSheId 组织单元Id
     * @param name 模糊查询参数
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSemendistribution> selectByzhuSheId(String zhuSheId, String name, String startDate, String endDate);

    /**
     * 新建Fid
     * @return String
     */
    String createFid();
}