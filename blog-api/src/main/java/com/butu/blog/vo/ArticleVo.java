package com.butu.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/22 23:35
 * FileName: ArticleVo
 */

@Data
public class ArticleVo {

    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

//    private ArticleBodyVo body;
//
    private List<TagVo> tags;
//
//    private List<CategoryVo> categorys;

}


