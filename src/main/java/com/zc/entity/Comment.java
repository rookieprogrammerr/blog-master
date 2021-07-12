package com.zc.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lize
 */

@Data
public class Comment {

    /**编号*/
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isAdminComment() {
        return adminComment;
    }

    public void setAdminComment(boolean adminComment) {
        this.adminComment = adminComment;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public Long getTopCommentId() {
        return topCommentId;
    }

    public void setTopCommentId(Long topCommentId) {
        this.topCommentId = topCommentId;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Comment> getChildComments() {
        return childComments;
    }

    public void setChildComments(List<Comment> childComments) {
        this.childComments = childComments;
    }

    /**昵称*/
    private String nickname;

    /**邮箱*/
    private String email;

    /**内容*/
    private String content;

    /**头像地址*/
    private String avatar;

    /**评论时间*/
    private Date createTime;

    /**是否是管理员评论*/
    private boolean adminComment;


    /**用于关联博客*/
    private Long blogId;
    /**父评论编号*/
    private Long parentCommentId;

    /**被回复人昵称*/
    private String replyName;

    /**记录回复的编号，例如5回复1，记录1*/
    private Long topCommentId;

    /**级联关系*/
    private Blog blog;

    private List<Comment> childComments = new ArrayList<>();

}
