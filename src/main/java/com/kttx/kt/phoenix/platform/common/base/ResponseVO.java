package com.kttx.kt.phoenix.platform.common.base;

import com.github.pagehelper.Page;
import com.google.common.collect.Maps;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
 * @date 2019-06-04 10:46
 * 文件描述:
 *
 */
@Data
public class ResponseVO implements Serializable {

    /**
     * 是否成功标识
     */
    private Boolean success;

    /**
     * 数据返回时的服务器时间戳
     */
    private Long timeStamp;

    /**
     * 若请求发生错误，则返回错误信息给前端
     */
    private String retcode;

    /**
     * 若请求发生错误，则返回错误信息给前端
     */
    private String retinfo;

    /**
     * 返回客户端的数据
     */
    private Object data;

    public Long getTimeStamp() {
        timeStamp = System.currentTimeMillis();
        return timeStamp;
    }

    /**
     * 正常返回查询成功的信息，默认赋值Success：true
     * 这里一般是一个对象，DTO数据在这里，直接和msg一个层级
     * @param data
     * @return
     */
    public static ResponseVO build(Object data) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.TRUE);
        responseVO.setRetcode("000000");
        responseVO.setData(data);
        return responseVO;
    }

    /**
     * 在返回List的时候，这里需要对list进行一次封装，
     * 用dataList来封装整个list后，按照2层数据返回给前端
     * @param list the data to set
     */
    public static ResponseVO build(List list) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.TRUE);
        responseVO.setRetcode("000000");
        Map<String, Object> map = new HashMap<>();
        map.put("dataList", list);
        responseVO.setData(map);
        return responseVO;
    }

    public static ResponseVO build(Page page) {
        ResponseVO responseVO = new ResponseVO();
        Map<String, Object> map = Maps.newHashMap();
        map.put("pageNum", page.getPageNum());
        map.put("pageSize", page.getPageSize());
        map.put("total", page.getTotal());
        map.put("pages", page.getPages());
        map.put("items", page);
        responseVO.setData(map);
        responseVO.setSuccess(Boolean.TRUE);
        return responseVO;
    }

    /**
     * 一般用于业务逻辑错误时候的返回类型，
     * 前端的报错信息直接用返回的retinfo
     *
     * @param e
     */
    public ResponseVO build(Exception e) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.FALSE);
        responseVO.setRetcode("000001");
        responseVO.setRetinfo(e.getMessage());
        return responseVO;
    }

    /**
     * 一般用于系统错误时候返回的信息，
     * 前端不会直接把报错信息抛给用户
     *
     * @param retcode
     * @param retinfo
     */
    public ResponseVO build(String retcode, String retinfo) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setSuccess(Boolean.FALSE);
        responseVO.setRetcode(retcode);
        responseVO.setRetinfo(retinfo);
        return responseVO;
    }











}
