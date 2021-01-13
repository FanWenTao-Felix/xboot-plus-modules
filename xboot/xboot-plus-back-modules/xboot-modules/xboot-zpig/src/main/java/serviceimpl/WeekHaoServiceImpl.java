package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigShengchanweekhaoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.WeekHaoService;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class WeekHaoServiceImpl implements WeekHaoService {
    private final CtPigShengchanweekhaoDao ctPigShengchanweekhaoDao;

    @Autowired
    public WeekHaoServiceImpl(CtPigShengchanweekhaoDao ctPigShengchanweekhaoDao) {
        this.ctPigShengchanweekhaoDao = ctPigShengchanweekhaoDao;
    }

    @Override
    public String selectWeekHao() {
        return ctPigShengchanweekhaoDao.selectByDate();
    }
}
