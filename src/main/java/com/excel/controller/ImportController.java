package com.excel.controller;

import com.alibaba.excel.EasyExcel;
import com.excel.dto.CampsUserDetailDto;
import com.excel.dto.CampsUserDetailDtoListenner;
import com.excel.dto.DataDto;
import com.excel.dto.DataDtoListener;
import com.excel.service.CampsUserDetailService;
import com.excel.service.DataService;
import com.excel.utils.TimeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import java.io.IOException;

@RestController
@RequestMapping("/data")
@Slf4j
public class ImportController {
    @Autowired
    CampsUserDetailService campsUserDetailService;

    @PostMapping(value = "/importExcel")
    public String importExcel(@RequestParam MultipartFile excelFile) throws IOException {
        Long beginTime = System.currentTimeMillis();
        EasyExcel.read(excelFile.getInputStream(), CampsUserDetailDto.class, new CampsUserDetailDtoListenner(campsUserDetailService)).sheet().doRead();
        Long endTime = System.currentTimeMillis();
        return TimeUtils.getTime(endTime - beginTime);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  单个数据大小
        factory.setMaxFileSize("100MB"); // KB,MB
        /// 总上传数据大小
        factory.setMaxRequestSize("100MB");
        return factory.createMultipartConfig();
    }
}
