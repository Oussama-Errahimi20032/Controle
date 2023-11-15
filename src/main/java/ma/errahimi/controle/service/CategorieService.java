package ma.errahimi.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.errahimi.controle.dao.IDao;
import ma.errahimi.controle.entities.Categorie;

@Service
public class CategorieService implements IDao<Categorie> {
	@Autowired
	ma.errahimi.controle.repositories.CategorieRepository categorieService;

	@Override
	public Categorie create(Categorie o) {
		return categorieService.save(o);
	}

	@Override
	public List<Categorie> findAll() {
		return categorieService.findAll();
	}

	@Override
	public Categorie update(Categorie o) {
		return categorieService.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
			categorieService.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Categorie findById(Long id) {
		return categorieService.findById(id).orElse(null);
	}
}
