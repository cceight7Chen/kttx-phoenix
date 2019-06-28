package com.kttx.kt.phoenix.platform.service;

import com.alibaba.fastjson.JSONObject;
import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.mapper.user.UserMapper;
import com.kttx.kt.phoenix.platform.utils.constants.KtRedisKeyUtil;
import com.kttx.kt.phoenix.platform.utils.redis.RedisClient;
import com.kttx.kt.phoenix.platform.utils.serializeUtil.SerializeUtil;
import javafx.util.Pair;
import netscape.javascript.JSObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
 * @date 2019-05-30 17:31
 * 文件描述:
 *
 */
@Service
public class BaseService {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    public RedisClient redisClient;

    @Resource
    public UserMapper userMapper;

    public UserBasicDO getUserBasicInfo(Long enterpriseId, Long userId) {

        UserBasicDO userBasicDO;
        String userBasicInfoKey = KtRedisKeyUtil.generateUserBasicInfoKey(userId, enterpriseId);
        try {
            // 先查询缓存
            String result = redisClient.get(userBasicInfoKey);
            userBasicDO = JSONObject.parseObject(result, UserBasicDO.class);
            if (Objects.nonNull(userBasicDO)) {
                logger.info("find userBasicDO from redis. and data is: " + userBasicDO.toString());
                return userBasicDO;
            } else {
                // 查询数据库
                Map<String, Object> queryMap = new HashMap<>();
                queryMap.put("enterpriseId", enterpriseId);
                queryMap.put("userId", userId);
                userBasicDO = userMapper.queryUserBasicInfo(queryMap);
                if (Objects.nonNull(userBasicDO)) {
                    redisClient.set(userBasicInfoKey, JSONObject.toJSONString(userBasicDO));
                }
                return userMapper.queryUserBasicInfo(queryMap);
            }
        } catch (Exception e) {
            logger.error("getUserBasicInfo from redis error, detail is : " , e);
            return null;
        }
    }
}
