package service;

import entity.CtPigSemencollection;

import java.util.List;

/**
 * @author AIERXUAN
 * 采集计划
 */
public interface SemenCollectionService {
    /**
     * 根据采精员查询采集计划
     * @param executorID 采精员Id
     * @return list
     */
    List<CtPigSemencollection> selectByCollectors(String executorID);
}
