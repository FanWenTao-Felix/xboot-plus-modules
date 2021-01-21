package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigZpigflkDao;
import entity.CtPigZpigflk;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ZPigFlkService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class ZPigFlkServiceImpl implements ZPigFlkService {
    private final CtPigZpigflkDao ctPigflkDao;

    @Autowired
    public ZPigFlkServiceImpl(CtPigZpigflkDao ctPigflkDao) {
        this.ctPigflkDao = ctPigflkDao;
    }

    @Override
    public List<CtPigZpigflk> selectByCfzhusheid(String zhuSheid) {
        return ctPigflkDao.selectByCfzhusheid(zhuSheid);
    }

    @Override
    public CtPigZpigflk selectByErHao(String erHao) {
        return ctPigflkDao.selectByErHao(erHao);
    }
}
