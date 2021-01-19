package dao;

import entity.CtPigSemendemandtype;

/**
 * @author AIERXUAN
 * @Entity entity.CtPigSemendemandtype
 */
public interface CtPigSemendemandtypeDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(CtPigSemendemandtype record);

    /**
     * @mbg.generated
     */
    int insertSelective(CtPigSemendemandtype record);

    /**
     * @mbg.generated
     */
    CtPigSemendemandtype selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CtPigSemendemandtype record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CtPigSemendemandtype record);

    /**
     * 查询特定类型的fid
     * @param fNameL2 名称
     * @return string
     */
    String selectFidByName(String fNameL2);
}