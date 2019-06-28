package com.kttx.kt.phoenix.platform.controller.paper;

import com.kttx.kt.phoenix.platform.domain.dto.UserInfoDTO;
import com.kttx.kt.phoenix.platform.service.paper.PaperServiceImpl;
import com.kttx.kt.phoenix.platform.service.user.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
@RestController
public class PaperController {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PaperServiceImpl paperService;

    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/KAO100101")
    public String queryPaperInfo() {

        logger.error("queryPaperInfo begin...");
//        UserInfoDTO userResult = userService.queryUserInfo();
//        logger.error("userResult is " + userResult);

        String paperResult = paperService.queryPaperInfo();
        logger.error("paperResult is " + paperResult);

        logger.error("queryPaperInfo end...");

        return paperResult;

    }

}
