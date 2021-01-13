package service;

import entity.CtPigZhushe;

import java.util.List;

/**
 * @author AIERXUAN
 */
public interface ZhuSheService {
    /**
     * 根据生产线查询猪舍
     * @param shChanLineid 生产线
     * @return lsit
     */
    List<CtPigZhushe> findAllByCfshchanlineid(String shChanLineid);
}
