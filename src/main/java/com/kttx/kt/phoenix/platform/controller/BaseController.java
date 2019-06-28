package com.kttx.kt.phoenix.platform.controller;


import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.domain.query.QueryCourseInfoDTO;
import com.kttx.kt.phoenix.platform.service.BaseService;
import com.kttx.kt.phoenix.platform.utils.redis.RedisClient;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
 * @date 2019-05-30 17:26
 * 文件描述:
 *
 */
public class BaseController {

    @Resource
    private RedisClient redisClient;

    @Resource
    private BaseService baseService;

    /**
     * 获取用户基础信息
     * @return
     */
    public UserBasicDO getUserBasicInfo(QueryCourseInfoDTO queryCourseInfoDTO) {
        if (Objects.nonNull(queryCourseInfoDTO) && Objects.nonNull(queryCourseInfoDTO.getEnterpriseId())
                && Objects.nonNull(queryCourseInfoDTO.getUserId())) {
            return baseService.getUserBasicInfo(queryCourseInfoDTO.getEnterpriseId(), queryCourseInfoDTO.getUserId());
        } else {
            return null;
        }
    }

    /**
     * 获取客户端IP
     *
     * @param request
     * @return
     */
    public String getClientIpWithProxy(HttpServletRequest request) {
        String ipAddress = "";

        ipAddress = request.getHeader("X-Real-IP");

        if ((!StringUtils.hasText(ipAddress)) || ("unknown".equalsIgnoreCase(ipAddress))) {
            ipAddress = request.getHeader("x-forwarded-for");
        }

        if ((!StringUtils.hasText(ipAddress)) || ("unknown".equalsIgnoreCase(ipAddress))) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if ((!StringUtils.hasText(ipAddress)) || ("unknown".equalsIgnoreCase(ipAddress))) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if ((!StringUtils.hasText(ipAddress)) || ("unknown".equalsIgnoreCase(ipAddress))) {
            ipAddress = request.getRemoteAddr();
        }

        if ((ipAddress != null) && (ipAddress.length() > 15) && (ipAddress.indexOf(",") > 0)) {
            ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
        }

        return ipAddress;
    }
}
