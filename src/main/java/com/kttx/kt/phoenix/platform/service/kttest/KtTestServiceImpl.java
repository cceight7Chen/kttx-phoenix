package com.kttx.kt.phoenix.platform.service.kttest;
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
   * @date 2019/6/21 17:45
   */

import com.kttx.kt.phoenix.platform.domain.dto.KtTestDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryKtTestDTO;
import com.kttx.kt.phoenix.platform.mapper.kttest.KtTestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KtTestServiceImpl {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private KtTestMapper ktTestMapper;

    /**
    　　* @description: 根据ExaminationID查询试卷信息
    　　* @author chenjiandong
    　　* @date 2019/6/21 17:46
    　　*/
    public List<KtTestDTO> queryKtTestList(QueryKtTestDTO queryKtTestDTO) {
        return ktTestMapper.queryKtTestList(queryKtTestDTO);
    }
}
