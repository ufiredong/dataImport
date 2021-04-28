package com.excel.service;

import com.excel.mapper.CampsUserDetailMapper;
import com.excel.model.CampsUserDetail;
import com.excel.model.CampsUserDetailExample;
import mboog.support.service.ReadService;
import mboog.support.service.UpsertService;
import mboog.support.service.WriteService;

public interface CampsUserDetailService extends ReadService<String, CampsUserDetail, CampsUserDetailExample, CampsUserDetailMapper>, WriteService<String, CampsUserDetail, CampsUserDetailExample, CampsUserDetailMapper>, UpsertService<String, CampsUserDetail, CampsUserDetailExample, CampsUserDetailMapper> {
}