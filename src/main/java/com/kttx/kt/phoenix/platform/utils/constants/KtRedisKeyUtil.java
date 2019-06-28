package com.kttx.kt.phoenix.platform.utils.constants;

import static com.kttx.kt.phoenix.platform.utils.constants.KtRedisConstants.*;

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
 * @date 2019-06-24 17:22
 * 文件描述:
 *
 */
public class KtRedisKeyUtil {

    /**
     * 用户基本信息表
     * @param userId
     * @param enterpriseId
     * @return
     */
    public static String generateUserBasicInfoKey(Long userId, Long enterpriseId) {
        // kt-user-basic-info-110-1021
        return KT_REDIS_PRE_KEY + KT_REDIS_USER_BASIC_INFO+ KT_REDIS_LINK + enterpriseId + KT_REDIS_LINK + userId;
    }

}
