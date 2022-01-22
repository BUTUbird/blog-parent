package com.butu.blog.api;

import com.butu.blog.dao.pojo.Article;
import com.butu.blog.service.ArticleService;
import com.butu.blog.vo.ArticleVo;
import com.butu.blog.vo.Result;
import com.butu.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/22 23:20
 * FileName: ArticleController
 */
@CrossOrigin
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result listArticles(@RequestBody PageParams pageParams){


        return articleService.listArticle(pageParams);
    }

}
