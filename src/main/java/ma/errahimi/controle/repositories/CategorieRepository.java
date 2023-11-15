package ma.errahimi.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.errahimi.controle.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
