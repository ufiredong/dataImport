package com.excel.dto;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.excel.model.Data;

import java.time.LocalDateTime;

@lombok.Data
public class DataDto {
    @ExcelIgnore
    private Integer id;

    @ExcelProperty(value = "姓名", index = 0)
    private String name;

    @ExcelProperty(value = "国籍", index = 1)
    private String nationality;

    @ExcelProperty(value = "手机", index = 2)
    private String mobile;

    @ExcelProperty(value = "Email", index = 3)
    private String email;
    @ExcelProperty(value = "地址", index = 4)
    private String address;
    @ExcelProperty(value = "其他信息", index = 5)
    private String otherInfo;
    @ExcelProperty(value = "录入时间", index = 6)
    private String createTime;
    @ExcelProperty(value = "来源", index = 7)
    private String dataSource;


    public static Data toData(DataDto dataDto){
        com.excel.model.Data data = new com.excel.model.Data();
        data.setDatasource(dataDto.getDataSource());
        data.setCreatetime(LocalDateTime.now());
        data.setOtherinfo(dataDto.getOtherInfo());
        data.setEmail(dataDto.getEmail());
        data.setName(dataDto.getName());
        data.setNationality(dataDto.getNationality());
        data.setMobile(dataDto.getMobile());
        data.setAddress(dataDto.getAddress());
        return data;
    }
}
