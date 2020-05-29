package com.example.blog.BlogApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DocumnetController {
    //for documentation only
    @RequestMapping(value = "/doc",method = RequestMethod.GET)
    public void getDocument(HttpServletResponse response){
        Map<String,Object> returnMap=new HashMap<>();
        try{
            response.sendRedirect("swagger-ui.html");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
