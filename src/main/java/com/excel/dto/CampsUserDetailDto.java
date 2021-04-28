package com.excel.dto;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.excel.model.CampsUserDetail;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/4/2810:46
 */
@Data
public class CampsUserDetailDto {
    @ExcelIgnore
    private String id;
    @ExcelProperty(value = "detail_id", index = 0)
    private String detail_id;
    @ExcelProperty(value = "user_id", index = 6)
    private String user_id;
    @ExcelProperty(value = "user_ip", index = 3)
    private String user_ip;
    @ExcelProperty(value = "user_mac", index = 4)
    private String user_mac;
    @ExcelProperty(value = "session_id", index = 1)
    private String session_id;
    @ExcelProperty(value = "username", index = 2)
    private String username;
    @ExcelProperty(value = "vlan_id", index = 5)
    private String vlan_id;
    @ExcelIgnore
    private LocalDateTime createTime;

    public static CampsUserDetail toCampsUserDetail(CampsUserDetailDto detailDto) {
        CampsUserDetail campsUserDetail = new CampsUserDetail();
        campsUserDetail.setDetailId(detailDto.getDetail_id());
        campsUserDetail.setId(UUID.randomUUID().toString());
        campsUserDetail.setSessionId(detailDto.getSession_id());
        campsUserDetail.setUserId(detailDto.getUser_id());
        campsUserDetail.setUserIp(detailDto.getUser_ip());
        campsUserDetail.setUserMac(detailDto.getUser_mac());
        campsUserDetail.setUsername(detailDto.getUsername());
        campsUserDetail.setVlanId(detailDto.getVlan_id());
        campsUserDetail.setCreatetime(LocalDateTime.now());
        return campsUserDetail;
    }

}
