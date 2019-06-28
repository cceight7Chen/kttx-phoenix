package com.kttx.kt.phoenix.platform.mapper.user;

import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.domain.dto.UserInfoDTO;
import javafx.util.Pair;
import org.apache.ibatis.annotations.Mapper;

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
 * @date 2019-05-30 17:36
* 文件描述:
 *
 */
@Mapper
public interface UserMapper {

    /**
     * 查询用户基本信息
     * @return
     */
    UserBasicDO queryUserBasicInfo(Map<String, Object> queryMap);


    UserInfoDTO queryUserInfo();
}

