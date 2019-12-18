package com.example.blog.BlogApi.service.BlogServiceImpl;

import com.example.blog.BlogApi.domain.Blog;
import com.example.blog.BlogApi.repository.BlogAppRepo;
import com.example.blog.BlogApi.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    BlogAppRepo blogAppRepo;
    @Override
    public List<Blog> getBlogs() {
        return blogAppRepo.findAll();
    }

    @Override
    public void persist(Blog blog) {
        blogAppRepo.save(blog);
    }

    @Override
    public void delete(Long id) {
        blogAppRepo.deleteById(id);
    }

    @Override
    public Blog getSingleBlogBy(Long id) {
        if(blogAppRepo.findById(id).isPresent()){
            return blogAppRepo.findById(id).get();
        }
        return null;
    }
}
