package dao;

import entity.TBdPerson;

import java.util.List;

/**
 * @Entity entity.TBdPerson
 */
public interface TBdPersonDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(TBdPerson record);

    /**
     * @mbg.generated
     */
    int insertSelective(TBdPerson record);

    /**
     * @mbg.generated
     */
    TBdPerson selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TBdPerson record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(TBdPerson record);

    /**
     * 采精员模糊查询
     * @param name 姓名
     * @return list
     */
    List<TBdPerson> selectByName(String name);
}