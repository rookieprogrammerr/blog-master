package com.zc.service;

import com.zc.entity.Blog;
import com.zc.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagService {
    public List<Tag> getAllTag();
    public Tag getTagById(Long id);
    public Tag getTagByName(String name);
    public void saveTag(Tag tag);
    public void updateTag(Tag tag);
    public void deleteTag(Long id);

}
