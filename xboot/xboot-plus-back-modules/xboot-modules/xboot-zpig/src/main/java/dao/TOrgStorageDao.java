package dao;

import entity.TOrgStorage;

import java.util.List;

/**
 * @author AIERXUAN
 * @Entity entity.TOrgStorage
 */
public interface TOrgStorageDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(TOrgStorage record);

    /**
     * @mbg.generated
     */
    int insertSelective(TOrgStorage record);

    /**
     * @mbg.generated
     */
    TOrgStorage selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TOrgStorage record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(TOrgStorage record);

    /**
     * 查找猪场
     * @return list
     */
    List<TOrgStorage> findAllByType();

    /**
     * 模糊查询
     * @param name name
     * @return  list
     */
    List<TOrgStorage> findAllByName(String name);
}