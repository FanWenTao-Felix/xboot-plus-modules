package service;

import entity.CtPigCollectionrecord;
import entity.TPmUser;

import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 * 采集记录的操作
 */
public interface CollectionRecordService {
    /**
     * 插入采集记录
     * @param record 记录
     * @return 1||0
     */
    int insertCollectionRecord(CtPigCollectionrecord record);

    /**
     * 查询未审核的当前猪舍下的采集记录
     * @param zhuSheId 猪舍
     * @return list
     */
    List<CtPigCollectionrecord> selectAll(String zhuSheId);

    /**
     * 模糊查询
     * @param zhuSheId 猪舍Id
     * @param selection name
     * @return list
     */
    List<CtPigCollectionrecord> selectSelective(String zhuSheId , String selection);

    /**
     * 查询指定日期的记录
     * @param zhuSheId 猪场Id
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return list
     */
    List<CtPigCollectionrecord> selectByDate(String zhuSheId , Date startDate, Date endDate);

    /**
     * 根据Id删除记录
     * @param fId 记录单据Id
     * @return 1||0
     */
    int deleteCollectionRecord(String fId);

    /**
     * 更新采集记录
     * @param record 记录
     * @return 1||0
     */
    int updateCollectionRecord(CtPigCollectionrecord record);

    /**
     * 计算间隔天数
     * @param earNumber 耳号
     * @return 天数
     */
    int intervalDays(String earNumber);

    /**
     * 批量审核
     * @param records 记录
     * @param TPmUser 用户
     * @return list
     */
    List<Integer> updateIfAufits(List<CtPigCollectionrecord> records, TPmUser TPmUser);
}
