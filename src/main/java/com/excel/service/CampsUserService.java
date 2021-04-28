package com.excel.service;

import com.excel.mapper.CampsUserMapper;
import com.excel.model.CampsUser;
import com.excel.model.CampsUserExample;
import mboog.support.service.ReadService;
import mboog.support.service.UpsertService;
import mboog.support.service.WriteService;

public interface CampsUserService extends ReadService<String, CampsUser, CampsUserExample, CampsUserMapper>, WriteService<String, CampsUser, CampsUserExample, CampsUserMapper>, UpsertService<String, CampsUser, CampsUserExample, CampsUserMapper> {
}