package service;

import entity.CtPigShchanline;

import java.util.List;

/**
 * @author AIERXUAN
 */
public interface ShenChanLineService {
    /**
     * 查询生产线
     * @param cforgunitId 猪场Id
     * @return list
     */
    List<CtPigShchanline> findByCforgunitId(String cforgunitId);
}
