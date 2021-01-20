package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigDemandapplicationDao;
import dao.CtPigSemensellrecordDao;
import entity.CtPigDemandapplication;
import entity.CtPigSemensellrecord;
import entity.TPmUser;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SemenSellRecordService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class SemenSellRecordServiceImpl implements SemenSellRecordService {
    private final CtPigSemensellrecordDao ctPigSemensellrecordDao;
    private final CtPigDemandapplicationDao ctPigDemandapplicationDao;
    @Autowired
    public SemenSellRecordServiceImpl(CtPigSemensellrecordDao ctPigSemensellrecordDao, CtPigDemandapplicationDao ctPigDemandapplicationDao) {
        this.ctPigSemensellrecordDao = ctPigSemensellrecordDao;
        this.ctPigDemandapplicationDao = ctPigDemandapplicationDao;
    }

    @Override
    public List<CtPigSemensellrecord> selectAll(String orgId) {
        return ctPigSemensellrecordDao.selectAll(orgId);
    }

    @Override
    public List<CtPigSemensellrecord> selectByOrgId(String orgId, String name, String startDate, String endDate) {
        return ctPigSemensellrecordDao.selectByOrgId(orgId, name, startDate, endDate);
    }

    @Override
    public int insert(@NotNull CtPigSemensellrecord ctPigSemensellrecord) {
        String fid = ctPigSemensellrecordDao.createFid();
        ctPigSemensellrecord.setFid(fid);
        return ctPigSemensellrecordDao.insert(ctPigSemensellrecord);
    }

    @Override
    public List<Integer> updateIfAuditing(@NotNull List<CtPigSemensellrecord> list, @NotNull TPmUser tPmUser) {
        String userId = tPmUser.getFid();
        List<Integer> result = new ArrayList<>();
        for (CtPigSemensellrecord ctPigSemensellrecord : list){
            String applicationId = ctPigSemensellrecord.getCfapplicationid();
            String completeStatus = ctPigSemensellrecord.getCfcompletestatusid();
            //更改需求单审核状态和完成状态
            CtPigDemandapplication ctPigDemandapplication = ctPigDemandapplicationDao.selectByPrimaryKey(applicationId);
            ctPigDemandapplication.setCfifauditing((long) 1);
            ctPigDemandapplication.setCfaudituserid(userId);
            ctPigDemandapplication.setCfcompletionstatus(completeStatus);
            int a = ctPigDemandapplicationDao.updateByPrimaryKey(ctPigDemandapplication);
            result.add(a);
        }
        return result;
    }

    @Override
    public int delByFid(String fid) {
        return ctPigSemensellrecordDao.deleteByPrimaryKey(fid);
    }

    @Override
    public int update(CtPigSemensellrecord ctPigSemensellrecord) {
        return ctPigSemensellrecordDao.updateByPrimaryKey(ctPigSemensellrecord);
    }
}
