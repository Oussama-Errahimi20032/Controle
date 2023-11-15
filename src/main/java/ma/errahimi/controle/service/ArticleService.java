package ma.errahimi.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.errahimi.controle.dao.IDao;
import ma.errahimi.controle.entities.Article;

@Service
public class ArticleService implements IDao<Article> {

	    @Autowired
	    ma.errahimi.controle.repositories.ArticleRepository articleRepository;

	    @Override
	    public Article create(Article o) {
	        return articleRepository.save(o);
	    }

	    @Override
	    public List<Article> findAll() {
	        return articleRepository.findAll();
	    }

	    @Override
	    public Article update(Article o) {
	        return articleRepository.save(o);
	    }

	    @Override
	    public boolean delete(Article o) {
	        try {
	            articleRepository.delete(o);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    @Override
	    public Article findById(Long id) {
	        return articleRepository.findById(id).orElse(null);
	    }
	}
