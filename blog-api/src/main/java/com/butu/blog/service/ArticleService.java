package com.butu.blog.service;

import com.butu.blog.vo.ArticleVo;
import com.butu.blog.vo.Result;
import com.butu.blog.vo.params.PageParams;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/22 23:38
 * FileName: ArticleService
 */
public interface ArticleService {
    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);
}
