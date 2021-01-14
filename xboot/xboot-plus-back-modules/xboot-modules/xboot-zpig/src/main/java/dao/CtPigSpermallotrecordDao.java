package dao;

import entity.CtPigSpermallotrecord;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigSpermallotrecord
 */
public interface CtPigSpermallotrecordDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSpermallotrecord record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSpermallotrecord record);

    /**
     * @mbg.generated
     */
    CtPigSpermallotrecord selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSpermallotrecord record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSpermallotrecord record);

    /**
     * 查询当前需求下的操作记录
     * @param applicationId 猪场Id
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSpermallotrecord> selectAllByFbizdates(String applicationId , Date startDate , Date endDate);

    /**
     * 查询当前需求下七天内的数据
     * @param applicationId 猪场Id
     * @return lsit
     */
    List<CtPigSpermallotrecord> selectAllByIntervaList(String applicationId);

    /**
     * 根据字段模糊查询
     * @param orgId 猪场ID
     * @param fuzzy 模糊字段
     * @return list
     */
    List<CtPigSpermallotrecord> selectAll(String orgId,String fuzzy);

    /**
     * 批量审核
     * @param fid 记录单据编号
     * @param userId 审核人
     * @return 1||0
     */
    int updateIfAuditByFid(@Param("fid") String fid , @Param("userId") String userId);

}
