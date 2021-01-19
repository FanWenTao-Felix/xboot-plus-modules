package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigDemandapplicationDao;
import dao.CtPigSemendistributionDao;
import entity.CtPigDemandapplication;
import entity.CtPigSemendistribution;
import entity.TPmUser;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SemenDistributionService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AIERXUAN
 * 精液发放
 */
@Service
@Slf4j
@DS("slave1")
public class SemenDistributionServiceImpl implements SemenDistributionService {
    private final CtPigSemendistributionDao ctPigSemendistributionDao;
    private final CtPigDemandapplicationDao ctPigDemandapplicationDao;
    @Autowired
    public SemenDistributionServiceImpl(CtPigSemendistributionDao ctPigSemendistributionDao, CtPigDemandapplicationDao ctPigDemandapplicationDao) {
        this.ctPigSemendistributionDao = ctPigSemendistributionDao;
        this.ctPigDemandapplicationDao = ctPigDemandapplicationDao;
    }

    @Override
    public List<CtPigSemendistribution> selectAll(String zhuSheId) {
        return ctPigSemendistributionDao.selectAll(zhuSheId);
    }

    @Override
    public List<CtPigSemendistribution> selectByzhuSheId(String zhuSheId, String name, String startDate, String endDate) {
        return ctPigSemendistributionDao.selectByzhuSheId(zhuSheId, name, startDate, endDate);
    }

    @Override
    public int insert(@NotNull CtPigSemendistribution ctPigSemendistribution) {
        ctPigSemendistribution.setFid(ctPigSemendistributionDao.createFid()                                    );
        return ctPigSemendistributionDao.insert(ctPigSemendistribution);
    }

    @Override
    public List<Integer> updateIfAuditing(@NotNull List<CtPigSemendistribution> list , TPmUser tPmUser) {
        List<Integer> result = new ArrayList();
        for (CtPigSemendistribution ctPigSemendistribution : list){
            /* 改变需求单中的完成状态 */
            String appFid = ctPigSemendistribution.getCfapplicationrecor();
            String completeStatus = ctPigSemendistribution.getCfcompletestatusid();
            CtPigDemandapplication ctPigDemandapplication = ctPigDemandapplicationDao.selectByPrimaryKey(appFid);
            ctPigDemandapplication.setCfcompletionstatus(completeStatus);
            ctPigDemandapplicationDao.updateByPrimaryKey(ctPigDemandapplication);

            ctPigSemendistribution.setCfifauditing((long) 1);
            ctPigSemendistribution.setCfaudituserid(tPmUser.getFid());
            int a = ctPigSemendistributionDao.updateByPrimaryKey(ctPigSemendistribution);
            result.add(a);
        }
        return result;
    }

    @Override
    public int delByFids(@NotNull CtPigSemendistribution ctPigSemendistribution) {
        return ctPigSemendistributionDao.deleteByPrimaryKey(ctPigSemendistribution.getFid());
    }

    @Override
    public int updateAll(CtPigSemendistribution ctPigSemendistribution) {
        return ctPigSemendistributionDao.updateByPrimaryKey(ctPigSemendistribution);
    }
}
