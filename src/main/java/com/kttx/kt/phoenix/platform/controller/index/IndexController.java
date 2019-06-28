package com.kttx.kt.phoenix.platform.controller.index;

import com.kttx.kt.phoenix.platform.common.base.ResponseVO;
import com.kttx.kt.phoenix.platform.controller.BaseController;
import com.kttx.kt.phoenix.platform.domain.dto.BannerDTO;
import com.kttx.kt.phoenix.platform.domain.dto.IndexDTO;
import com.kttx.kt.phoenix.platform.domain.query.QueryIndexDTO;
import com.kttx.kt.phoenix.platform.service.index.BannerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
 * @date 2019-06-06 16:25
 * 文件描述:
 *
 */
@RestController
public class IndexController extends BaseController {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BannerServiceImpl bannerService;

    @PostMapping("KTP1001001")
    public ResponseVO queryIndexInfo(@RequestBody QueryIndexDTO queryIndexDTO) {

        logger.error("KTP1001001-queryIndexInfo begin ...");
        ResponseVO responseVO = new ResponseVO();

        // 查询banner图
        Map<String, Object> bannerMap = new HashMap<>();
        List<BannerDTO> bannerDTOList = bannerService.queryBannerList(110L);
        bannerMap.put("isShow",true);
        bannerMap.put("dataList", bannerDTOList);


        IndexDTO indexDTO = new IndexDTO();
        indexDTO.setBannerMap(bannerMap);
        responseVO.setData(indexDTO);
        return responseVO;
    }

    public static void main(String[] args) {
        Double a = 0.0;
        a += 1.0;
        System.out.println(a);
        System.out.println(a * 100 / 2.0);

    }

}
