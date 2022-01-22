package com.butu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.butu.blog.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/22 23:24
 * FileName: ArticleMapper
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
