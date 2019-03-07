package com.zb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.entity.Comment;
import com.zb.entity.Detail;
import com.zb.service.CommentService;
import com.zb.service.DetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DetailController {
    @Reference(timeout = 10000)
    private DetailService ds;
    @Reference(timeout = 10000)
    private CommentService cs;
    @RequestMapping(value = "/show")
    @ResponseBody
    public List<Detail> show(){
        return ds.getAllDetail();
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/del")
    @ResponseBody
    public String del(Integer id){
        int n=cs.delComment(id);
        int m=ds.delDetail(id);

        if(n>0&&m>0||n==0&&m>0){
            return "ok";
        }else{
            return "not";
        }
    }
    Comment c=new Comment();

    @RequestMapping(value ="/toadd")
    public String toadd(Integer id){
       c.setNewsId(id);
        System.out.println(id);
        return "add";
    }

    @RequestMapping(value = "/add")
    @ResponseBody
        public String add(String content,String author){
            c.setContent(content);
            c.setAuthor(author);
            cs.addComment(c);
            return "ok";
        }





}
