package service;

import entity.TBdMaterial;

/**
 * @author AIERXUAN
 * 物料
 */
public interface MaterialService {
    /**
     * 查询品种
     * @param fid ID
     * @return 物料
     */
    TBdMaterial selectByPrimaryKey(String fid);
}
