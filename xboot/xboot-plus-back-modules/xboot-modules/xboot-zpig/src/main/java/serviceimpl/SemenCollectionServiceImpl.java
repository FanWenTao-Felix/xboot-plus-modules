package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigSemencollectionDao;
import entity.CtPigSemencollection;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SemenCollectionService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class SemenCollectionServiceImpl implements SemenCollectionService {
    private final CtPigSemencollectionDao ctPigSemencollectionDao;

    @Autowired
    public SemenCollectionServiceImpl(CtPigSemencollectionDao ctPigSemencollectionDao) {
        this.ctPigSemencollectionDao = ctPigSemencollectionDao;
    }

    @Override
    public List<CtPigSemencollection> selectByCollectors(String executorID) {
        return ctPigSemencollectionDao.selectAll(executorID);
    }

    @Override
    public List<Integer> updateByFidsInts(@NotNull List<String> fids) {
        List<Integer> result = null;
        for (String fid : fids) {
            int a = ctPigSemencollectionDao.updatDesign(fid);
            result.add(a);
        }
        return result;
    }
}
