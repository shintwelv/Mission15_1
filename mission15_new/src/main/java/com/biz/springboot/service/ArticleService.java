package com.biz.springboot.service;

import com.biz.springboot.model.Article;

public interface ArticleService {

	void insert(Article article);

	void update(Article article);

	void delete(Article article);

	Article selectRecentArticle();

}