package com.zc.service;

import com.zc.entity.Comment;

import java.util.List;

public interface CommentService {
    public void saveComment(Comment comment);
    public List<Comment> getCommentByBlogId(Long blogId);
}
