package com.zc.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Type {

    /**编号*/
    private Long id;

    /**分类名*/
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    /**级联关系*/
    private List<Blog> blogs = new ArrayList<>();

}
