//package com.excel.dto;
//
//import com.alibaba.excel.context.AnalysisContext;
//import com.alibaba.excel.event.AnalysisEventListener;
//import com.alibaba.fastjson.JSON;
//import com.excel.model.Data;
//import com.excel.service.CampsUserService;
//import com.excel.service.DataService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author ufiredong
// * @Title:
// * @Package
// * @Description:
// * @date 2021/4/289:50
// */
//public class UserDtoListenner extends AnalysisEventListener<UserDto> {
//    private static final Logger LOGGER = LoggerFactory.getLogger(UserDtoListenner.class);
//
//
//    /**
//     * 每隔 N 条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
//     */
//
//    private static final int BATCH_COUNT = 3000;
//    private CampsUserService campsUserService;
//
//    // 解析的数据存放
//    List<Data> list = new ArrayList<>();
//
//    /**
//     * dataService 数据库操作类
//     * 因为listener 监听类不归Spring管理，所以 @Autowired 无法依赖注入，采用构造 注入
//     */
//    public UserDtoListenner(CampsUserService campsUserService) {
//        LOGGER.info("----dataService-----");
//        this.campsUserService = campsUserService;
//    }
//
//    @Override
//    public void invoke(UserDto user, AnalysisContext analysisContext) {
//        LOGGER.info("解析一条信息：{}", JSON.toJSONString(user));
//        list.add(DataDto.toData(user));
//        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
//        if (list.size() >= BATCH_COUNT) {
//            save();
//            // 存储完成清理 list
//            list.clear();
//        }
//    }
//    @Override
//    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
//        //执行尾部不足3000记录的list
//        save();
//        LOGGER.info("数据导入完毕");
//    }
//
//    public void save() {
//        dataService.batchInsertSelective(list);
//    }
//
//}
