package com.excel.dto;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.excel.model.CampsUserDetail;
import com.excel.model.Data;
import com.excel.service.CampsUserDetailService;
import com.excel.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/4/2810:58
 */
public class CampsUserDetailDtoListenner extends AnalysisEventListener<CampsUserDetailDto> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CampsUserDetailDtoListenner.class);


    private CampsUserDetailService campsUserDetailService;

    // 解析的数据存放
    List<CampsUserDetail> list = new ArrayList<>();

    /**
     * 每隔 N 条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */

    private static final int BATCH_COUNT = 3000;


    public CampsUserDetailDtoListenner(CampsUserDetailService campsUserDetailService) {
        LOGGER.info("----campsUserDetailService-----");
        this.campsUserDetailService = campsUserDetailService;
    }


    @Override
    public void invoke(CampsUserDetailDto detailDto, AnalysisContext analysisContext) {
        LOGGER.info("解析一条信息：{}", JSON.toJSONString(detailDto));
        list.add(CampsUserDetailDto.toCampsUserDetail(detailDto));
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            save();
            // 存储完成清理 list
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //执行尾部不足3000记录的list
        save();
        LOGGER.info("数据导入完毕");
    }

    public void save() {
        campsUserDetailService.batchInsertSelective(list);
    }
}
