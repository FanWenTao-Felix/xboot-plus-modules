package dao;

import entity.CtPigCollectionrecord;
import entity.TPmUser;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigCollectionrecord
 */
public interface CtPigCollectionrecordDao {
    /**
     * 删除
     * @param fid Id
     * @return 1||0
     */
    int deleteByPrimaryKey(String fid);

    /**
     * 插入
     * @param record 记录
     * @return 1||0
     */
    int insert(CtPigCollectionrecord record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigCollectionrecord record);

    /**
     * @mbg.generated
     */
    CtPigCollectionrecord selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigCollectionrecord record);

    /**
     * 更新
     * @param record 记录
     * @return 1||0
     */
    int updateByPrimaryKey(CtPigCollectionrecord record);

    /**
     * 根据耳号查询最近一次记录
     * @param earNumber 耳号
     * @return date
     */
    Date selectDateByearNumber(String earNumber);

    /**
     * 查询猪场近7天采集记录
     * @param storageId 猪场Id
     * @return list
     */
    List<CtPigCollectionrecord> selectAll(String storageId);

    /**
     * 查询指定日期的记录
     * @param storageId 猪场Id
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return list
     */
    List<CtPigCollectionrecord> selectByDate(String storageId , Date startDate, Date endDate);

    /**
     * 模糊查询记录
     * @param orgId 猪场
     * @param selection 查询条件
     * @return list
     */
    List<CtPigCollectionrecord> selectSelective(String orgId , String selection);

    /**
     * 查询是否已审核CFIFAUDITING
     * @param fid 编号
     * @return 1||0 1代表已审批
     */
    int selectIfAuditByFid(@Param("fid") String fid);

    /**
     * 更新审核状态、审核人
     * @param fid fId
     * @param userId 审核人Id
     * @return 1||0
     */
    int updateIfAuditByFid(@Param("fid") String fid ,@Param("userId") String userId);
}
