package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigJinyearchivesDao;
import dao.CtPigStoragesreDao;
import dao.CtPigStoragestockingrecordDao;
import entity.CtPigJinyearchives;
import entity.CtPigStoragesre;
import entity.CtPigStoragestockingrecord;
import entity.TPmUser;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StorageService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@Service
@DS("slave1")
public class StorageServiceImpl implements StorageService {
    private final CtPigStoragesreDao ctPigStoragesreDao;
    private final CtPigJinyearchivesDao ctPigJinyearchivesDao;
    private final CtPigStoragestockingrecordDao ctPigStoragestockingrecordDao;

    @Autowired
    public StorageServiceImpl(CtPigStoragesreDao ctPigStoragesreDao, CtPigJinyearchivesDao ctPigJinyearchivesDao, CtPigStoragestockingrecordDao ctPigStoragestockingrecordDao) {
        this.ctPigStoragesreDao = ctPigStoragesreDao;
        this.ctPigJinyearchivesDao = ctPigJinyearchivesDao;
        this.ctPigStoragestockingrecordDao = ctPigStoragestockingrecordDao;
    }

    @Override
    public CtPigStoragestockingrecord selectLatedNumber(String orgId) {
        return ctPigStoragestockingrecordDao.selectLatest(orgId);
    }

    @Override
    public Integer selectTheoryNumber(String orgId) {
        CtPigStoragestockingrecord ct = ctPigStoragestockingrecordDao.selectLatest(orgId);
        int theoryNumber , latedNumber;
        if (ct == null || ct.getCffactnumber() == null) {
            latedNumber = 0;
        }else {
            latedNumber =  ct.getCffactnumber().intValue();
        }
        int addNumber = ctPigStoragestockingrecordDao.selectPeizhitId(orgId)
                + ctPigStoragestockingrecordDao.selectSpermId(orgId)
                + ctPigStoragestockingrecordDao.SelectWaijin(orgId);
        int reduceNumber = ctPigStoragestockingrecordDao.selectSell(orgId)
                + ctPigStoragestockingrecordDao.selectBaoXiao(orgId)
                + ctPigStoragestockingrecordDao.selectDistribution(orgId)
                + ctPigStoragestockingrecordDao.selectSpermOutput(orgId);
        theoryNumber = latedNumber + addNumber - reduceNumber;
        return theoryNumber;
    }

    @Override
    public List<Integer> selectByParentId(String parentID) {
        //方便用户操作，将精液档案中理论存在的数据赋值给数据
        List<Integer> list = new ArrayList<>();
        //1.获取组织Id
        CtPigStoragestockingrecord ctPigStoragestockingrecord = ctPigStoragestockingrecordDao.selectByPrimaryKey(parentID);
        String orgUnit = ctPigStoragestockingrecord.getCforgunitid();
        List<CtPigJinyearchives> semenArchives = ctPigJinyearchivesDao.selectByOrgId(orgUnit);
        for (CtPigJinyearchives semen : semenArchives){
            CtPigStoragesre ctPigStoragesre = new CtPigStoragesre();
            ctPigStoragesre.setFid(ctPigStoragesreDao.createFid());
            ctPigStoragesre.setFparentid(parentID);
            ctPigStoragesre.setCfsemennumberid(semen.getFnumber());
            ctPigStoragesre.setCfvarietyid(semen.getCfgeneticsid());
            ctPigStoragesre.setCfearnumberid(semen.getCfgongzhuerhaoid());
            ctPigStoragesre.setCfdoseid(semen.getCfdoseid());
            ctPigStoragesre.setCfpeijingpersonid(semen.getCfpeijinpersonid());
            ctPigStoragesre.setCfconfigurationdate(semen.getFbizdate());
            ctPigStoragesre.setCfenddate(semen.getCfoutdate());
            ctPigStoragesre.setCfbatchnumber(semen.getCfbatchnumber());
            ctPigStoragesre.setCftheoricalnumber(1L);
            //2.插入记录
            Integer re = ctPigStoragesreDao.insert(ctPigStoragesre);
            list.add(re);
        }
        return list;
    }

    @Override
    public Integer updateIfAuditing(@NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord, @NotNull TPmUser tPmUser) {
        String auditorId = tPmUser.getFid();
        ctPigStoragestockingrecord.setCfifauditing(1L);
        ctPigStoragestockingrecord.setCfaudituserid(auditorId);
        Date date = new Date();
        ctPigStoragestockingrecord.setCfauditdate(date);
        return ctPigStoragestockingrecordDao.updateByPrimaryKey(ctPigStoragestockingrecord);
    }

    @Override
    public Integer insertRecord(@NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord) {
        String fid = ctPigStoragestockingrecordDao.createFid();
        ctPigStoragestockingrecord.setFid(fid);
        return ctPigStoragestockingrecordDao.insert(ctPigStoragestockingrecord);
    }

    @Override
    public Integer insertEntry(@NotNull CtPigStoragesre ctPigStoragesre , @NotNull CtPigStoragestockingrecord ctPigStoragestockingrecord) {
        String fid = ctPigStoragesreDao.createFid();
        String partentId = ctPigStoragestockingrecord.getFid();
        ctPigStoragesre.setFparentid(partentId);
        ctPigStoragesre.setFid(fid);
        return ctPigStoragesreDao.insert(ctPigStoragesre);
    }

    @Override
    public List<CtPigStoragesre> selectByName(String parentId, String name, Date beforeDate, Date endDate) {
        return ctPigStoragesreDao.selectByConditions(parentId, name, beforeDate, endDate);
    }

    @Override
    public List<CtPigStoragesre> selectEntry(String parentId) {
        return ctPigStoragesreDao.selectByFparentids(parentId);
    }

    @Override
    public Integer deleteByEntryId(String fid) {
        return ctPigStoragesreDao.deleteByPrimaryKey(fid);
    }

    @Override
    public Integer updateEntry(CtPigStoragesre ctPigStoragesre) {
        return ctPigStoragesreDao.updateByPrimaryKey(ctPigStoragesre);
    }
}
