package com.kttx.kt.phoenix.platform.service.index;

import com.kttx.kt.phoenix.platform.domain.dos.BannerDO;
import com.kttx.kt.phoenix.platform.domain.dto.BannerDTO;
import com.kttx.kt.phoenix.platform.mapper.index.BannerMapper;
import com.kttx.kt.phoenix.platform.utils.enums.BannerStatusEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
 * @date 2019-06-06 16:51
 * 文件描述:
 *
 */
@Service
public class BannerServiceImpl {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BannerMapper bannerMapper;

    /**
     * 查询banner图
     * @param enterpriseId
     * @return
     */
    public List<BannerDTO> queryBannerList(Long enterpriseId) {
        logger.info("queryBannerList begin ...");
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("enterpriseId", enterpriseId);
        queryMap.put("status", BannerStatusEnum.Vaild.getValue());
        List<BannerDO> bannerDOList = bannerMapper.queryBannerList(queryMap);
        // 循环赋值
        List<BannerDTO> bannerDTOList = new ArrayList<>();
        for (BannerDO bannerDO :bannerDOList) {
            BannerDTO bannerDTO = new BannerDTO();
            BeanUtils.copyProperties(bannerDO, bannerDTO);
            bannerDTOList.add(bannerDTO);
        }
        logger.info("queryBannerList end ...");
        return bannerDTOList;
    }
}
