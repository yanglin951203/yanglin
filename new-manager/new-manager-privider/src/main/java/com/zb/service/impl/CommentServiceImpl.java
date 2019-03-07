package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Comment;
import com.zb.mapper.CommentMapper;
import com.zb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(interfaceClass = CommentService.class)
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public int delComment(int id) {
        return commentMapper.delComment(id);
    }

    @Override
    public int addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }
}
