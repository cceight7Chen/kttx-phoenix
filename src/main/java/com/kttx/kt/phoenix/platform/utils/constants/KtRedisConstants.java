package com.kttx.kt.phoenix.platform.utils.constants;

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
 * @date 2019-06-04 21:02
 * 文件描述:
 *
 */
public interface KtRedisConstants {

    /**
     * 缓存key前缀
     */
    String KT_REDIS_PRE_KEY = "kt-";

    /**
     * 缓存key连接符
     */
    String KT_REDIS_LINK = "-";

    /**
     * 用户基本信息
     */
    String KT_REDIS_USER_BASIC_INFO = "user-basic-info";

    /**
     * 用户USER
     */
    String KT_REDIS_USER = "user";

    /**
     * 学习平台
     */
    String KT_REDIS_ENTERPRISE = "enterprise";


}
