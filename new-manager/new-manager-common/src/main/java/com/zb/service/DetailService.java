package com.zb.service;

import com.zb.entity.Detail;

import java.util.List;

public interface DetailService {
    public List<Detail> getAllDetail();

    public int delDetail(int id);
}
