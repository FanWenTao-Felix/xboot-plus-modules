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
}
