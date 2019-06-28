package com.kttx.kt.phoenix.platform.mapper.kttest;

import com.kttx.kt.phoenix.platform.domain.dto.KtTestQuestionDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryKtTestQuestionDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
   * @date 2019/6/27 16:23
   */
@Mapper
public interface KtTestQuestionMapper {

    /**
    　　* @description: 测验试卷查询接口
    　　* @author chenjiandong
    　　* @date 2019/6/27 16:25
    　　*/
    List<KtTestQuestionDTO> queryKtTestQuestionList(QueryKtTestQuestionDTO queryKtTestQuestionDTO);

}
