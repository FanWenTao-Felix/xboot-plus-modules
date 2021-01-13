package dao;

import entity.CtPigShengchanweekhao;

import java.util.Date;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigShengchanweekhao
 */
public interface CtPigShengchanweekhaoDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigShengchanweekhao record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigShengchanweekhao record);

    /**
     * @mbg.generated
     */
    CtPigShengchanweekhao selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigShengchanweekhao record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigShengchanweekhao record);

    /**
     * 根据当前日期查找周号
     * @return 周号
     */
    String selectByDate();
}