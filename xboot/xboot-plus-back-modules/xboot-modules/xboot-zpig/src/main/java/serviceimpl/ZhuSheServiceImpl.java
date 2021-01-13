package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigZhusheDao;
import entity.CtPigZhushe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ZhuSheService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class ZhuSheServiceImpl implements ZhuSheService {
    private final CtPigZhusheDao ctPigZhusheDao;

    @Autowired
    public ZhuSheServiceImpl(CtPigZhusheDao ctPigZhusheDao) {
        this.ctPigZhusheDao = ctPigZhusheDao;
    }

    @Override
    public List<CtPigZhushe> findAllByCfshchanlineid(String shChanLineid) {
        return ctPigZhusheDao.findAllByCfshchanlineid(shChanLineid);
    }
}
