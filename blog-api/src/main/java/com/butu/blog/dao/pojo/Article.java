package com.butu.blog.dao.pojo;

import lombok.Data;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/22 23:16
 * FileName: Article
 */

@Data
public class Article {

    public static final int ARTICLE_TOP = 1;

    public static final int ARTICLE_COMMON = 0;

    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    /**
     * 作者id
     */
    private Long authorId;
    /**
     * 内容id
     */
    private Long bodyId;
    /**
     *类别id
     */
    private Long categoryId;

    /**
     * 置顶
     */
    private int weight = ARTICLE_COMMON;


    /**
     * 创建时间
     */
    private Long createDate;
}


