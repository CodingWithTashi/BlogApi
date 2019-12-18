package com.example.blog.BlogApi.controller;

import com.example.blog.BlogApi.domain.Blog;
import com.example.blog.BlogApi.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/blog/")
public class BlogController {
    @Autowired
    IBlogService blogService;
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public Map<String,Object> getBlog(){
        Map<String,Object> returnMap=new HashMap<>();
        try{
            List<Blog> blogList=blogService.getBlogs();
            returnMap.put("status","succcess");
            returnMap.put("data",blogList);
        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("message",e.getMessage());
        }

        return returnMap;
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Map<String,Object> getBlog(@RequestBody Blog blog){
        Map<String,Object> returnMap=new HashMap<>();
        try{
            blogService.persist(blog);
            returnMap.put("status","succcess");
            returnMap.put("message","Blog post successfully");
        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("message",e.getMessage());
        }

        return returnMap;
    }
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public Map<String,Object> deleteBlog(@PathVariable Long id){
        Map<String,Object> returnMap=new HashMap<>();
        try{
            blogService.delete(id);
            returnMap.put("status","succcess");
            returnMap.put("message","Blog deleted successfully");
        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("message",e.getMessage());
        }

        return returnMap;
    }
    @RequestMapping(value = "update/{id}",method = RequestMethod.PUT)
    public Map<String,Object> upadteBlog(@RequestBody Blog blog, @PathVariable Long id){
        Map<String,Object> returnMap=new HashMap<>();
        try{
            Blog returnBlog=blogService.getSingleBlogBy(id);
            returnBlog.setTitle(blog.getTitle());
            returnBlog.setDescription(blog.getDescription());
            returnBlog.setUrl(blog.getUrl());
            blogService.persist(returnBlog);
            returnMap.put("status","succcess");
            returnMap.put("message","Blog updated successfully");
        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("message",e.getMessage());
        }

        return returnMap;
    }
}
