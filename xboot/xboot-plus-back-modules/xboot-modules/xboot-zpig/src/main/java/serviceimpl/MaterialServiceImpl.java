package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.TBdMaterialDao;
import entity.TBdMaterial;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.MaterialService;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class MaterialServiceImpl implements MaterialService {
    private final TBdMaterialDao tBdMaterialDao;

    @Autowired
    public MaterialServiceImpl(TBdMaterialDao tBdMaterialDao) {
        this.tBdMaterialDao = tBdMaterialDao;
    }

    @Override
    public TBdMaterial selectByPrimaryKey(String fid) {
        return tBdMaterialDao.selectByPrimaryKey(fid);
    }
}
