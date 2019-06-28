package com.kttx.kt.phoenix.platform.service.user;

import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.domain.dto.UserInfoDTO;
import com.kttx.kt.phoenix.platform.mapper.user.UserMapper;
import com.kttx.kt.phoenix.platform.service.BaseService;
import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
 * @date 2019-05-30 17:33
 * 文件描述:
 *
 */
@Service
public class UserServiceImpl extends BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper;

    public UserInfoDTO queryUserInfo() {
        logger.error("进入paperService层");
        return userMapper.queryUserInfo();
    }

    public UserBasicDO queryUserBasicInfo() {
        logger.error("queryUserInfo");
        Long userId = 10001L;
        Long enterpriseId = 110L;
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("enterpriseId", enterpriseId);
        queryMap.put("userId", userId);
        return userMapper.queryUserBasicInfo(queryMap);
    }
}
