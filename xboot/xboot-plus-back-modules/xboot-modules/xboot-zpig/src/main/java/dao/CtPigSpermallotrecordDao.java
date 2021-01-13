package dao;

import entity.CtPigSpermallotrecord;

import java.util.Date;
import java.util.List;

/**
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
     * 查询
     * @param orgId 猪场Id
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return list
     */
    List<CtPigSpermallotrecord> selectAllByFbizdates(String orgId , Date startDate , Date endDate);

    /**
     * 查询七天内的数据
     * @param orgId 猪场Id
     * @return
     */
    List<CtPigSpermallotrecord> selectAllByIntervaList(String orgId);
}