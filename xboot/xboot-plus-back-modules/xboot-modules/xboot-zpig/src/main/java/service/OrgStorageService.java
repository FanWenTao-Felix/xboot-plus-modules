package service;

import entity.TOrgStorage;

import java.util.List;

/**
 * @author AIERXUAN
 * 查询种猪场
 */
public interface OrgStorageService {
    /**
     * 查找猪场
     * @return list
     */
    List<TOrgStorage> findAllByType();

    /**
     * 根据fid查找猪场
     * @param fid 猪场id
     * @return list
     */
    TOrgStorage findAllByFid(String fid);

    /**
     * 模糊查询
     * @param name name
     * @return  list
     */
    List<TOrgStorage> findByName(String name);
}
