package serviceimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import service.TPmUserService;

import java.io.IOException;

/**
 * @author AIERXUAN
 */
@Service
@Slf4j
@DS("slave1")
public class TPmUserServiceImpl implements TPmUserService {
    final OkHttpClient okHttpClient;
    public TPmUserServiceImpl(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    @Override
    public String selectUser(String openId) {
        //1.获取用户（云之家基本接口）
        String url = "https://mp.lihuamuye.com/centerapi/api/yzjCenter/getPmIdByEid";
        RequestBody body = new FormBody.Builder()
                .add("openId",openId)
                .build();
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = null;
        String selectUser = null;
        try {
            response = okHttpClient.newCall(request).execute();
            selectUser = response.body().string();
            response.close();
        } catch (IOException e) {
            selectUser = "获取用户信息出错";
        }
        return selectUser;
    }

    @Override
    public String selectOrgUrl(){
        //获取组织(云之家基本信息)
        String url = "https://mp.lihuamuye.com/centerapi/api/yzjCenter/getYzjOrganizations";
        RequestBody body = new FormBody.Builder().build();
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = null;
        String org = null;
        try {
            response = okHttpClient.newCall(request).execute();
            org = response.body().string();
            response.close();
        } catch (IOException e) {
            org = "获取组织信息出错";
        }
        return org;
    }
}
