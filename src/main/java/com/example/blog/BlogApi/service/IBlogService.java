package com.example.blog.BlogApi.service;

import com.example.blog.BlogApi.domain.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getBlogs();
    public void persist(Blog blog);
    public  void delete(Long id);

    Blog getSingleBlogBy(Long id);
}
