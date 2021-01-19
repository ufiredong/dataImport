package com.excel.service;

import com.excel.mapper.DataMapper;
import com.excel.model.Data;
import com.excel.model.DataExample;
import mboog.support.service.ReadService;
import mboog.support.service.UpsertService;
import mboog.support.service.WriteService;

public interface DataService extends ReadService<Integer, Data, DataExample, DataMapper>, WriteService<Integer, Data, DataExample, DataMapper>, UpsertService<Integer, Data, DataExample, DataMapper> {
}