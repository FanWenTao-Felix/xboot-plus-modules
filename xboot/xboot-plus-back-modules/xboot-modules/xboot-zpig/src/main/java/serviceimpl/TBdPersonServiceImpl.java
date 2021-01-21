package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.TBdPersonDao;
import entity.TBdPerson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TBdPersonService;

import java.util.List;

/**
 * @author AIERXUAN
 */

@Slf4j
@Service
@DS("slave1")
public class TBdPersonServiceImpl implements TBdPersonService {
    private final TBdPersonDao tBdPersonDao;

    @Autowired
    public TBdPersonServiceImpl(TBdPersonDao tBdPersonDao) {
        this.tBdPersonDao = tBdPersonDao;
    }

    @Override
    public List<TBdPerson> selectByName(String name) {
        return tBdPersonDao.selectByName(name);
    }
}
