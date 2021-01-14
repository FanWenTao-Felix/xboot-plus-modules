package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigDemandapplicationDao;
import entity.CtPigDemandapplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PigDemandService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class PigDemandServiceImpl implements PigDemandService {
    private final CtPigDemandapplicationDao demandapplicationDao;

    public PigDemandServiceImpl(CtPigDemandapplicationDao demandapplicationDao) {
        this.demandapplicationDao = demandapplicationDao;
    }

    @Override
    public List<CtPigDemandapplication> selectDeamands(String toOrgId,String applicationStatus) {
        return demandapplicationDao.selectByConditions(toOrgId,applicationStatus);
    }

    @Override
    public List<CtPigDemandapplication> selectAllDeamands(String toOrgId, String applicationStatus) {
        return demandapplicationDao.selectAllByConditions(toOrgId,applicationStatus);
    }
}
