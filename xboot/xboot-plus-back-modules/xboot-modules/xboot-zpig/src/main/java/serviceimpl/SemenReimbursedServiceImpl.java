package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import dao.CtPigSemenreimburserecoedDao;
import entity.CtPigSemenreimburserecoed;
import entity.TPmUser;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SemenReimbursedService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class SemenReimbursedServiceImpl implements SemenReimbursedService {
    private final CtPigSemenreimburserecoedDao ctPigSemenreimburserecoedDao;
    @Autowired
    public SemenReimbursedServiceImpl(CtPigSemenreimburserecoedDao ctPigSemenreimburserecoedDao) {
        this.ctPigSemenreimburserecoedDao = ctPigSemenreimburserecoedDao;
    }

    @Override
    public List<CtPigSemenreimburserecoed> selectAll(String zhuSheId) {
        return ctPigSemenreimburserecoedDao.selectAll(zhuSheId);
    }

    @Override
    public int insert(@NotNull CtPigSemenreimburserecoed ctPigSemenreimburserecoed) {
        List<CtPigSemenreimburserecoed> a = ctPigSemenreimburserecoedDao.selectBySemenNumber(ctPigSemenreimburserecoed.getCfsemennumberid());
        int b;
        if (a.size() > 0) {
            b = 0;
        }else {
            String fid = ctPigSemenreimburserecoedDao.createFid();
            ctPigSemenreimburserecoed.setFid(fid);
            b = ctPigSemenreimburserecoedDao.insert(ctPigSemenreimburserecoed);
        }
        return b;
    }

    @Override
    public List<Integer> update(@NotNull List<CtPigSemenreimburserecoed> records , TPmUser tPmUser) {
        //审核
        //更新审核者和使用状态
        List<Integer> result = new ArrayList<>();
        for ( CtPigSemenreimburserecoed record : records){
            record.setCfifauditing((long) 1);
            String userId = tPmUser.getFid();
            record.setCfaudituserid(userId);
            int a = ctPigSemenreimburserecoedDao.insert(record);
            result.add(a);
        }
        return result;
    }

    @Override
    public List<CtPigSemenreimburserecoed> selectByCondition(String zhuSheId, String name, String startDate, String endDate) {
        List<CtPigSemenreimburserecoed> list = ctPigSemenreimburserecoedDao.selectByOrgId(zhuSheId, name, startDate, endDate);
        return list;
    }

    @Override
    public int deleteByPrimaryKey(String fid) {
        return ctPigSemenreimburserecoedDao.deleteByPrimaryKey(fid);
    }

    @Override
    public int updateByCondition(CtPigSemenreimburserecoed ctPigSemenreimburserecoed) {
        return ctPigSemenreimburserecoedDao.updateByPrimaryKey(ctPigSemenreimburserecoed);
    }
}
