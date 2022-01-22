package com.butu.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.butu.blog.dao.mapper.ArticleMapper;
import com.butu.blog.dao.pojo.Article;
import com.butu.blog.service.ArticleService;
import com.butu.blog.service.SysUserService;
import com.butu.blog.service.TagService;
import com.butu.blog.vo.ArticleVo;
import com.butu.blog.vo.Result;
import com.butu.blog.vo.params.PageParams;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/1/22 23:49
 * FileName: ArticleServiceImpl
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private TagService tagService;

    @Override
    public Result listArticle(PageParams pageParams) {

        /**
         * 分页查询
         */
        Page<Article> page = new Page<Article>(pageParams.getPage(), pageParams.getPageSize());
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //是否置顶排序
        //时间排序
        queryWrapper.orderByDesc(Article::getWeight,Article::getCreateDate);
        Page<Article> articlePage = articleMapper.selectPage(page, queryWrapper);
        List<Article> records = articlePage.getRecords();
        List<ArticleVo> articleVoList = copyList(records,true,true);
        return Result.success(articleVoList);
    }

    private List<ArticleVo> copyList(List<Article> records,boolean isTag,boolean isAuthor) {
        List<ArticleVo> articleVoList = new ArrayList<ArticleVo>();
        for (Article record:records){
            articleVoList.add(copy(record,isTag,isAuthor));
        }
        return articleVoList;
    }
    private ArticleVo copy (Article article,boolean isTag,boolean isAuthor){
        ArticleVo articleVo = new ArticleVo();
        BeanUtils.copyProperties(article, articleVo);
        articleVo.setCreateDate(new DateTime(article.getCreateDate()).toString("yyyy-MM-dd HH:mm"));
        if (isTag){
            Long articleId = article.getId();
            articleVo.setTags(tagService.findTagsByArticleId(articleId));
        }
        if (isAuthor){
            Long authorId = article.getAuthorId();
            articleVo.setAuthor(sysUserService.findUserById(authorId).getNickname());
        }
        return articleVo;
    }


}
