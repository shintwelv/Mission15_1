package com.biz.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.springboot.model.Article;
import com.biz.springboot.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	@RequestMapping(value = {"/", "/goMain.do"})
	public String fwdHome() {
		return "index";
	}
	
	@RequestMapping(value = "insert.do")
	public String fwdInsert() {
		return "insert";
	}
	
	@RequestMapping(value = "update.do")
	public String fwdUpdate(HttpServletRequest request) {
		Article recentArticle = service.selectRecentArticle();
		if (recentArticle == null) {
			return "noArticle";
		}
		request.setAttribute("article", recentArticle);
		
		return "update";
	}
	
	@RequestMapping(value = "delete.do")
	public String fwdDelete(HttpServletRequest request) {
		Article recentArticle = service.selectRecentArticle();
		if (recentArticle == null) {
			return "noArticle";
		}
		request.setAttribute("article", recentArticle);
		
		return "delete";
	}
	
	@RequestMapping(value = "view.do")
	public String fwdView(HttpServletRequest request) {
		Article recentArticle = service.selectRecentArticle();
		if (recentArticle == null) {
			return "noArticle";
		}
		request.setAttribute("article", recentArticle);
		
		return "view";
	}
	
	@RequestMapping(value = "insertProcess.do")
	public String insertProcess(Article article) {
		service.insert(article);
		
		return "insertSuccess";
	}
	
	@RequestMapping(value = "updateProcess.do")
	public String updateProcess(Article article) {
		service.update(article);
		
		return "updateSuccess";
	}
	
	@RequestMapping(value = "deleteProcess.do")
	public String deleteProcess(Article article) {
		service.delete(article);
		
		return "deleteSuccess";
	}
	

}
