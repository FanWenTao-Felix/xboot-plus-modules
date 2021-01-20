package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.TOrgStorageDao;
import entity.TOrgStorage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrgStorageService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class OrgStorageServiceImpl implements OrgStorageService {
    private final TOrgStorageDao tOrgStorageDao;

    @Autowired
    public OrgStorageServiceImpl(TOrgStorageDao tOrgStorageDao) {
        this.tOrgStorageDao = tOrgStorageDao;
    }

    @Override
    public List<TOrgStorage> findAllByType() {
        return tOrgStorageDao.findAllByType();
    }

    @Override
    public TOrgStorage findAllByFid(String fid) {
        return tOrgStorageDao.selectByPrimaryKey(fid);
    }

    @Override
    public List<TOrgStorage> findByName(String name) {
        return tOrgStorageDao.findAllByName(name);
    }

}
