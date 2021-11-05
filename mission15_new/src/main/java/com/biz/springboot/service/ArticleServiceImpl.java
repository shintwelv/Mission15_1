package com.biz.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.springboot.model.Article;
import com.biz.springboot.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository repository;
	
	 @Override
	public void insert(Article article) {
		 repository.save(article);
	 }
	 
	 @Override
	public void update(Article article) {
		 repository.save(article);
	 }
	 
	 @Override
	public void delete(Article article) {
		repository.delete(article);
	 }
	 
	 @Override
	public Article selectRecentArticle() {
		Article article = repository.findTopByOrderByArticleIdDesc();
		return article;
	}
	 

}
