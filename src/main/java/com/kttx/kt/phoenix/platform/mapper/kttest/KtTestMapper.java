package com.kttx.kt.phoenix.platform.mapper.kttest;
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
   * @date 2019/6/21 17:53
   */

import com.kttx.kt.phoenix.platform.domain.dto.KtTestDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryKtTestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KtTestMapper {

    /**
    　　* @description: 测验信息查询（kt_examination）
    　　* @author chenjiandong
    　　* @date 2019/6/24 9:37
    　　*/
    List<KtTestDTO> queryKtTestList(QueryKtTestDTO queryKtTestDTO);

}
