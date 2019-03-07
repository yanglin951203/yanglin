package com.zb.mapper;

import com.zb.entity.Comment;

public interface CommentMapper {
    public  int delComment(int id);

    public int addComment(Comment comment);
}
