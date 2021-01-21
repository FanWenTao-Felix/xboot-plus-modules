package service;

import entity.TBdPerson;

import java.util.List;

/**
 * @author AIERXUAN
 */
public interface TBdPersonService {
    /**
     * 采精员模糊查询
     * @param name 姓名
     * @return list
     */
    List<TBdPerson> selectByName(String name);
}
