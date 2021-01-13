package dao;

import entity.TPmUser;

/**
 * @Entity entity.TPmUser
 */
public interface TPmUserDao {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int insert(TPmUser record);

    /**
     * @mbg.generated
     */
    int insertSelective(TPmUser record);

    /**
     * @mbg.generated
     */
    TPmUser selectByPrimaryKey(String fid);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TPmUser record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(TPmUser record);
}