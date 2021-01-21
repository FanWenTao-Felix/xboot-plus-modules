package service;

import entity.CtPigZpigflk;

import java.util.List;

/**
 * @author AIERXUAN
 * 种猪档案(耳号)
 */
public interface ZPigFlkService {
    /**
     * 查询耳号
     * @param zhuSheid 猪舍Id
     * @return list
     */
    List<CtPigZpigflk> selectByCfzhusheid(String zhuSheid);

    /**
     * 根据耳号查询记录
     * @param erHao 耳号
     * @return CtPigZpigflk
     */
    CtPigZpigflk selectByErHao(String erHao);
}
