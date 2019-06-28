package com.kttx.kt.phoenix.platform.controller.user;

import com.kttx.kt.phoenix.platform.controller.BaseController;
import com.kttx.kt.phoenix.platform.domain.dos.UserBasicDO;
import com.kttx.kt.phoenix.platform.domain.dto.UserInfoDTO;
import com.kttx.kt.phoenix.platform.service.user.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
 * @date 2019-05-30 17:16
 * 文件描述:
 *
 */
@RestController
public class UserController extends BaseController {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserServiceImpl userService;

    /**
     * 这里
     * PostMapping默认只能用post请求来调用
     * RequestMapping可以使用GET、POST请求来调用
     * 并且UserInfoDTO可以接收相同的数据
     * @param userInfoDTO
     * @return
     */
    @PostMapping("KAO111000")
    public UserInfoDTO queryUserInfo(@RequestBody UserInfoDTO userInfoDTO) {
        logger.info("begin queryUserInfo...");
        logger.info("userInfoDTO is : ,{}" ,userInfoDTO);

        // 新建userInfoDTO对象
        UserInfoDTO testDTO1 = new UserInfoDTO();
        testDTO1.setId(1L);
        testDTO1.setMobile("15950559491");
        testDTO1.setRegisterTime("2019-06-03 15:12:12");
        List<String> names1 = new ArrayList<>();
        names1.add("laowang1");
        names1.add("laowang2");
        names1.add("laowang3");
        names1.add("laowang4");
        testDTO1.setNames(names1);
        return testDTO1;
    }



    @PostMapping("KAO111001")
    public UserBasicDO testGetBasicInfoByPair() {
        logger.info("begin queryUserInfo...");
        UserBasicDO userBasicDO = userService.getUserBasicInfo(110L, 10001L);
        return userBasicDO;
    }
    
}
