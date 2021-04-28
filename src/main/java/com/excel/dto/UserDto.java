package com.excel.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/4/289:50
 */
@Data
public class UserDto {
    @ExcelProperty(value = "", index = 0)
    private String userId;
    @ExcelProperty(value = "姓名", index = 0)
    private String username;

    private String desc;

    private LocalDateTime createTime;

}
