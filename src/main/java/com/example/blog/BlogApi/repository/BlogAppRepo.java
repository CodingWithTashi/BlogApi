package com.example.blog.BlogApi.repository;

import com.example.blog.BlogApi.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogAppRepo extends JpaRepository<Blog,Long> {
}
