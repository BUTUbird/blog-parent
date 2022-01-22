package com.butu.blog.service;

import com.butu.blog.vo.TagVo;

import java.util.List;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/23 21:48
 * FileName: TagService
 */
public interface TagService {
    /**
     * 查找文章id
     * @param articleId
     * @return
     */
    List<TagVo> findTagsByArticleId(Long articleId);
}
