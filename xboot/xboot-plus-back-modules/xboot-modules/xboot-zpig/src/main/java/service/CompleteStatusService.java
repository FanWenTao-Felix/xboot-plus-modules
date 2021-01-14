package service;

import entity.CtPigCompletestatus;

import java.util.List;

/**
 * @author AIERXUAN
 */
public interface CompleteStatusService {
    /**
     * 查询所有完成状态(精液调拨审核时同步到需求申请单中)
     * @return list
     */
    List<CtPigCompletestatus> selectAll();
}
