package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigDemandapplicationDao;
import dao.CtPigSemendemandtypeDao;
import entity.CtPigDemandapplication;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DemandApplicationService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@Service
@DS("slave1")
public class DemandApplicationServiceImpl implements DemandApplicationService {
    private final CtPigDemandapplicationDao ctPigDemandapplicationDao;
    private final CtPigSemendemandtypeDao ctPigSemendemandtypeDao;

    @Autowired
    public DemandApplicationServiceImpl(CtPigDemandapplicationDao ctPigDemandapplicationDao, CtPigSemendemandtypeDao ctPigSemendemandtypeDao) {
        this.ctPigDemandapplicationDao = ctPigDemandapplicationDao;
        this.ctPigSemendemandtypeDao = ctPigSemendemandtypeDao;
    }

    @Override
    public List<CtPigDemandapplication> selectDemandapplication(String orgId, @NotNull String statusName) {
        String demandStatus = ctPigSemendemandtypeDao.selectFidByName(statusName);
        return ctPigDemandapplicationDao.selectByConditions(orgId , demandStatus);
    }

    @Override
    public int update(CtPigDemandapplication ctPigDemandapplication) {
        return ctPigDemandapplicationDao.updateByPrimaryKey(ctPigDemandapplication);
    }
}
