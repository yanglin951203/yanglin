package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Detail;
import com.zb.mapper.CommentMapper;
import com.zb.mapper.DetailMapper;
import com.zb.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service(interfaceClass =DetailService.class )
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailMapper detailMapper;

    @Override
    public List<Detail> getAllDetail() {
        return detailMapper.getAllDetail();
    }

    @Override

    public int delDetail(int id) {


        return detailMapper.delDetail(id);
    }
}
