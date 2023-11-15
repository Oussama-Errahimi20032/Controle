package ma.errahimi.controle.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.errahimi.controle.entities.Categorie;
import ma.errahimi.controle.entities.Categorie;
import ma.errahimi.controle.service.CategorieService;


@RestController
@RequestMapping("/api/v1/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping
    public List<Categorie> findAllCategories() {
        return categorieService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
       Categorie categorie = categorieService.findById(id);
        if (categorie == null) {
            return new ResponseEntity<Object>("Categorie avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);

        } else {
            return ResponseEntity.ok(categorie);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletCategorie(@PathVariable Long id) {
       Categorie categorie = categorieService.findById(id);
        if (categorie == null) {
            return new ResponseEntity<Object>("Categorie avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
        } else {
            categorieService.delete(categorie);
            return ResponseEntity.ok("categorie avec id " + id + " suprime");
        }
    }

    

    @PostMapping
    public Categorie creatCategorie(@RequestBody Categorie categorie) {
       
        return categorieService.create(categorie);
    }
}