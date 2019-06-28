package com.kttx.kt.phoenix.platform.controller;

import com.kttx.kt.phoenix.platform.common.base.ResponseVO;
import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.domain.dto.UserInfoDTO;
import com.kttx.kt.phoenix.platform.service.course.CourseServiceImpl;
import com.kttx.kt.phoenix.platform.service.user.UserServiceImpl;
import com.kttx.kt.phoenix.platform.utils.redis.RedisClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/***
 *
 *          ┌─┐       ┌─┐
 *       ┌──┘ ┴───────┘ ┴──┐
 *       │                 │
 *       │       ───       │
 *       │  ─┬┘       └┬─  │
 *       │                 │
 *       │       ─┴─       │
 *       │                 │
 *       └───┐         ┌───┘
 *           │         │
 *           │         │
 *           │         │
 *           │         └──────────────┐
 *           │                        │
 *           │                        ├─┐
 *           │                        ┌─┘    
 *           │                        │
 *           └─┐  ┐  ┌───────┬──┐  ┌──┘         
 *             │ ─┤ ─┤       │ ─┤ ─┤         
 *             └──┴──┘       └──┴──┘ 
 *               神兽保佑  代码无BUG!
 *
 *
 * @author : wangjia
 * @date 2019-06-04 14:01
 * 文件描述:
 *
 */
@RestController
public class TestController extends BaseController{

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private DataSource dataSource;

    @Resource
    private RedisClient redisClient;

    @Resource
    private CourseServiceImpl courseService;

    @Resource
    private UserServiceImpl userService;

    @RequestMapping("Redis000000")
    public ResponseVO redisTest() {
        String name = null;
        try {
            redisClient.set("testKeyWangjia","wangjia");
            name = courseService.getNameFromRedis("testKeyWangjia");
        } catch (Exception e) {
            logger.error("redisTest :" , e);
        }
        return ResponseVO.build(name);
    }

    @RequestMapping("Test000000")
    public ResponseVO dataSource() {
        return ResponseVO.build(dataSource.toString());
    }

    /**
     * 返回一个对象
     * @return
     */
    @PostMapping("Test000001")
    public ResponseVO testObjectResponse(HttpServletRequest request) {
        String ipAddress = getClientIpWithProxy(request);
        logger.error("ipAddress is : " + ipAddress);
        UserInfoDTO userInfoDTO = assembleUserInfoDTO(1L);
        return ResponseVO.build(userInfoDTO);
    }

    /**
     * 返回一个List
     * @return
     */
    @PostMapping("Test000002")
    public ResponseVO testListResponse() {
        UserBasicDO userBasicDO = userService.queryUserBasicInfo();
        return ResponseVO.build(userBasicDO);
    }

    /**
     *
     * @param id
     * @return
     */
    public UserInfoDTO assembleUserInfoDTO(Long id) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setId(id);
        userInfoDTO.setMobile("13395713264");
        userInfoDTO.setRegisterTime("2019-09-08 23:12:12");
        List<String> names = new ArrayList<>();
        names.add("yangchunyan");
        names.add("huzunlei");
        names.add("wangwei");
        names.add("gaochengwei");
        names.add("dingtong");
        userInfoDTO.setNames(names);
        return userInfoDTO;
    }

}
