package com.kttx.kt.phoenix.platform.controller.kttest;
/*
    |-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.| 
    |                     ______                     |
    |                  .-"      "-.                  |
    |                 /            \                 |
    |     _          |              |          _     |
    |    ( \         |,  .-.  .-.  ,|         / )    |
    |     > "=._     | )(__/  \__)( |     _.=" <     |
    |    (_/"=._"=._ |/     /\     \| _.="_.="\_)    |
    |           "=._"(_     ^^     _)"_.="           |
    |               "=\__|IIIIII|__/="               |
    |              _.="| \IIIIII/ |"=._              |
    |    _     _.="_.="\          /"=._"=._     _    |
    |   ( \_.="_.="     `--------`     "=._"=._/ )   |
    |    > _.="                            "=._ <    |
    |   (_/              NO  BUG  !            \_)   |
    |                                                |
    '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=' 
   * @description: 测验考试Controller
   * @author chenjiandong
   * @date 2019/6/21 14:20
   */


import com.kttx.kt.phoenix.platform.common.base.ResponseVO;
import com.kttx.kt.phoenix.platform.domain.dto.KtTestQuestionDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryKtTestQuestionDTO;
import com.kttx.kt.phoenix.platform.service.kttest.KtTestQuestionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class KtTestQuestionController {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private KtTestQuestionServiceImpl ktTestQuestionService;

    /**
    　　* @description: 测验信息查询
    　　* @author chenjiandong
    　　* @date 2019/6/21 15:35
    　　*/
    @PostMapping("KTP8002001")
    public ResponseVO queryKtTestQuestionInfo(@RequestBody QueryKtTestQuestionDTO dto) {

        logger.info("KTP0808001-queryKtTestInfo begin ...");
        //传入试卷ExaminationID
        dto.setTestQuestionId(dto.getTestQuestionId());
        List<KtTestQuestionDTO> ktTestQuestionDTOList = ktTestQuestionService.queryKtTestQuestionList(dto);
        return ResponseVO.build(ktTestQuestionDTOList);
    }

}
