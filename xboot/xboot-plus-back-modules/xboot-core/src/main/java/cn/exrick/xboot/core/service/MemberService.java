package cn.exrick.xboot.core.service;

import cn.exrick.xboot.core.base.XbootBaseService;
import cn.exrick.xboot.core.common.vo.SearchVo;
import cn.exrick.xboot.core.entity.Member;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 会员接口
 * @author Exrick
 */
@CacheConfig(cacheNames = "member")
public interface MemberService extends XbootBaseService<Member, String> {

    /**
    * 多条件分页获取
    * @param member
    * @param searchVo
    * @param pageable
    * @return
    */
    Page<Member> findByCondition(Member member, SearchVo searchVo, Pageable pageable);

    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    @Cacheable(key = "#username")
    Member findByUsername(String username);

    /**
     * 通过手机获取用户
     * @param mobile
     * @return
     */
    Member findByMobile(String mobile);
}