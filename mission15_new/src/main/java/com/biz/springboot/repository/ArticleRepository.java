package com.biz.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biz.springboot.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{

	Article findTopByOrderByArticleIdDesc();
	
	void delete(Article article);
	
	Article save(Article article);
}
