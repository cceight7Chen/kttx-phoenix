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
   * @date 2019/6/27 16:04
   */
@Data
public class KtTestQuestionDO {

    private String id;

    private String gmtCreate;

    private String gmtModified;

    private Long creatorId;

    private String creator;

    private Long modifierId;

    private String modifier;

    private String testId;

    private Long testBatch;

    private Long itemId;

    private Long questionNo;

    private Long questionType;

    private String questionName;

    private String questionOptions;

    private String questionAnswer;

    private Double questionScore;

    private Long status;


}
