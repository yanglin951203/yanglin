package com.zb.mapper;

import com.zb.entity.Detail;

import java.util.List;

public interface DetailMapper {
    public List<Detail> getAllDetail();

    public int delDetail(int id);
}
