package com.excel.service.impl;

import com.excel.mapper.CampsUserMapper;
import com.excel.model.CampsUser;
import com.excel.model.CampsUserExample;
import com.excel.service.CampsUserService;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import mboog.support.service.ServiceSupport;
import org.springframework.stereotype.Service;

@Service
public class CampsUserServiceImpl extends ServiceSupport<String, CampsUser, CampsUserExample, CampsUserMapper> implements CampsUserService {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table camps_user
     *
     * @mbg.generated Wed Apr 28 09:49:25 CST 2021
     */
    @Resource
    private CampsUserMapper campsUserMapper;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camps_user
     *
     * @mbg.generated Wed Apr 28 09:49:25 CST 2021
     */
    @PostConstruct
    private void initService() {
        super.mapper = campsUserMapper;
    }
}