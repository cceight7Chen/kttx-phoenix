package com.kttx.kt.phoenix.platform.controller.kttest;

import com.kttx.kt.phoenix.platform.common.base.ResponseVO;
import com.kttx.kt.phoenix.platform.domain.query.QueryKtTestDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryKtTestUserInfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
   * @description: TODO
   * @author chenjiandong
   * @date 2019/6/28 10:59
   */

@RestController
public class KtTestUserInfoController
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("KTP8003001")
    public ResponseVO queryTestUserInfo(@RequestBody QueryKtTestUserInfoDTO dto) {

        logger.info("KTP0808001-queryTestUserInfo begin ...");
        dto.setUserId(10002L);
        //传入试卷ExaminationID
        List<KtTestDTO> ktTestDTOList = ktTestService.queryKtTestList(queryKtTestDTO);
        return ResponseVO.build(ktTestDTOList);
    }
}
