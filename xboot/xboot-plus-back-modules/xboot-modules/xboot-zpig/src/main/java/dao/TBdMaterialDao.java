package dao;

import entity.TBdMaterial;

/**
 * @Entity entity.TBdMaterial
 */
public interface TBdMaterialDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(TBdMaterial record);

    /**
     * @mbg.generated
     */
    int insertSelective(TBdMaterial record);

    /**
     * 查询物料
     * @param fid Id
     * @return
     */
    TBdMaterial selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TBdMaterial record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(TBdMaterial record);

}