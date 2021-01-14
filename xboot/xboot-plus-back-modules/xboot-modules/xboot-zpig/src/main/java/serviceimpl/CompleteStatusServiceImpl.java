package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigCompletestatusDao;
import entity.CtPigCompletestatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CompleteStatusService;

import java.util.List;

/**
 * @author AIERXUAN
 */
@Slf4j
@Service
@DS("slave1")
public class CompleteStatusServiceImpl implements CompleteStatusService {
    private final CtPigCompletestatusDao ctPigCompletestatusDao;

    @Autowired
    public CompleteStatusServiceImpl(CtPigCompletestatusDao ctPigCompletestatusDao) {
        this.ctPigCompletestatusDao = ctPigCompletestatusDao;
    }

    @Override
    public List<CtPigCompletestatus> selectAll() {
        return ctPigCompletestatusDao.selectAll();
    }
}
