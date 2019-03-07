package com.zb.service;

import com.zb.entity.Comment;

public interface CommentService {
    public  int delComment(int id);

    public int addComment(Comment comment);
}
