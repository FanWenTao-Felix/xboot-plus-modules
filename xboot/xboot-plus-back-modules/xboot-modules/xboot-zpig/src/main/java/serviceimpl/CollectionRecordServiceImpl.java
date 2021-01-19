package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigCollectionrecordDao;
import dao.CtPigSemencollectionDao;
import entity.CtPigCollectionrecord;
import entity.TPmUser;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CollectionRecordService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class CollectionRecordServiceImpl implements CollectionRecordService {
    private final CtPigCollectionrecordDao ctPigCollectionrecordDao;
    private final CtPigSemencollectionDao ctPigSemencollectionDao;
    @Autowired
    public CollectionRecordServiceImpl(CtPigCollectionrecordDao ctPigCollectionrecordDao, OkHttpClient okHttpClient, CtPigSemencollectionDao ctPigSemencollectionDao) {
        this.ctPigCollectionrecordDao = ctPigCollectionrecordDao;
        this.ctPigSemencollectionDao = ctPigSemencollectionDao;
    }

    @Override
    public int insertCollectionRecord(CtPigCollectionrecord record) {
        record.setFid(ctPigCollectionrecordDao.createFid());
        return ctPigCollectionrecordDao.insert(record);
    }

    @Override
    public List<CtPigCollectionrecord> selectAll(String earNUmber) {
        return ctPigCollectionrecordDao.selectAll(earNUmber);
    }

    @Override
    public int deleteCollectionRecord(String fId) {
        CtPigCollectionrecord ctPigCollectionrecord = ctPigCollectionrecordDao.selectByPrimaryKey(fId);
        int audiType = ctPigCollectionrecord.getCfifauditing().intValue();
        if (audiType == 1){
            return 0;
        }else {
            return ctPigCollectionrecordDao.deleteByPrimaryKey(fId);
        }
    }

    @Override
    public int updateCollectionRecord(@NotNull CtPigCollectionrecord record) {
        if (ctPigCollectionrecordDao.selectIfAuditByFid(record.getFid()) == 1){
            return 0;
        }else {
            return ctPigCollectionrecordDao.updateByPrimaryKey(record); 
        }
        
    }

    @Override
    public int intervalDays(String earNumber) {
        int days = 0;
        //最近查询日期
        Date beforeDate = ctPigCollectionrecordDao.selectDateByearNumber(earNumber);
        if (beforeDate != null) {
            Date nowDate = new Date();
            days = (int) ((nowDate.getTime() - beforeDate.getTime())/24/60/60/1000);
        }
        return days;
    }

    @Override
    public List<Integer> updateIfAufits(@NotNull List<CtPigCollectionrecord> records , @NotNull TPmUser tPmUser) {
        List<Integer> results =new ArrayList<>();
        String userId = tPmUser.getFid();
        for (CtPigCollectionrecord ctPigCollectionrecord : records) {
            String fid = ctPigCollectionrecord.getFid();
            String appFid = ctPigCollectionrecord.getCfdesignnumberid();
            //审核时更新精液采集计划状态
            ctPigSemencollectionDao.updatDesign(appFid);
            results.add(ctPigCollectionrecordDao.updateIfAuditByFid(fid , userId));
        }
        return results;
    }

}
