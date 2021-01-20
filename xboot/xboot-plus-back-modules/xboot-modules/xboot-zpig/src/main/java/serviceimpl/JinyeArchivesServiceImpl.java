package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigJinyearchivesDao;
import entity.CtPigJinyearchives;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.JinyeArchivesService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@Service
@DS("slave1")
public class JinyeArchivesServiceImpl implements JinyeArchivesService {
    private final CtPigJinyearchivesDao ctPigJinyearchivesDao;

    @Autowired
    public JinyeArchivesServiceImpl(CtPigJinyearchivesDao ctPigJinyearchivesDao) {
        this.ctPigJinyearchivesDao = ctPigJinyearchivesDao;
    }

    @Override
    public int updateIfUsed(String fid) {
        return ctPigJinyearchivesDao.updateIfUsed(fid);
    }

    @Override
    public int insertArchive(CtPigJinyearchives ctPigJinyearchives) {
        String fid = ctPigJinyearchivesDao.createFid();
        ctPigJinyearchives.setFid(fid);
        return ctPigJinyearchivesDao.insert(ctPigJinyearchives);
    }

    @Override
    public List<CtPigJinyearchives> selectByConditions(String earNumber) {
        return ctPigJinyearchivesDao.selectByConditions(earNumber);
    }

    @Override
    public List<CtPigJinyearchives> selectByOrg(String orgId) {
        return ctPigJinyearchivesDao.selectByOrgId(orgId);
    }

    @Override
    public CtPigJinyearchives selectByPrimary(String fid) {
        return ctPigJinyearchivesDao.selectByPrimaryKey(fid);
    }

    @Override
    public List<CtPigJinyearchives> selectByNumbers(String semenNumber) {
        return ctPigJinyearchivesDao.selectByNumber(semenNumber);
    }

    @Override
    public CtPigJinyearchives selectByPrimaryKey(String key) {
        return ctPigJinyearchivesDao.selectByPrimaryKey(key);
    }

    @Override
    public String createFid() {
        return ctPigJinyearchivesDao.createFid();
    }
}
