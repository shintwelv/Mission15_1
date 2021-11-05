package com.biz.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "springboot_crud")
@Data
public class Article {
	@Id
	@GeneratedValue
	@Column(name = "article_id")
	private int articleId;
	
	@Column(name = "article_title")
	private String articleTitle;
	
	@Column(name = "article_content")
	private String articleContent;
}
