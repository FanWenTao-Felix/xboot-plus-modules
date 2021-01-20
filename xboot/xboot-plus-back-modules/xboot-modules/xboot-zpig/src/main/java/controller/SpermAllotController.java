package controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AIERXUAN
 */

@Slf4j
@RestController
@Api(description = "调拨记录")
@RequestMapping("/xboot/ZpigManager/SpermAllot")
@CacheConfig(cacheNames = "spermAllot")
@CrossOrigin
public class SpermAllotController {
}
