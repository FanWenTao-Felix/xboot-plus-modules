package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigShchanlineDao;
import entity.CtPigShchanline;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShenChanLineService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class ShenChanLineServiceImpl implements ShenChanLineService {
    private final CtPigShchanlineDao ctPigShchanlineDao;

    @Autowired
    public ShenChanLineServiceImpl(CtPigShchanlineDao ctPigShchanlineDao) {
        this.ctPigShchanlineDao = ctPigShchanlineDao;
    }

    @Override
    public List<CtPigShchanline> findByCforgunitId(String cforgunitId) {
        return ctPigShchanlineDao.findByCforgunitId(cforgunitId);
    }
}
