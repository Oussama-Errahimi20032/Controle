package ma.errahimi.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.errahimi.controle.entities.Article;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
