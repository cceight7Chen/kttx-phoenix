package com.kttx.kt.phoenix.platform.domain.dos;

import lombok.Data;


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
   * @date 2019/6/21 16:33
   */

@Data
public class KtTestDO {

    private String id;

    private String gmtCreate;

    private String gmtModified;

    private Long creatorId;

    private String creator;

    private Long modifierId;

    private String modifier;

    private Long type;

    private String testName;

    private String description;

    private String qrcodeUrl;

    private Long platformId;

    private String platformType;

    private Long upperLimit;

    private Long passRate;

    private Long duration;

    private Long status;

    private Long easyQuestionNum;

    private Long isTemplet;

}
