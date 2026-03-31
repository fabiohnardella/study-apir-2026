package br.com.fiap.study_apir_2026.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.study_apir_2026.model.Produto;
import br.com.fiap.study_apir_2026.repository.RepositoryProdutoMockup;

@RestController
@RequestMapping("${api.version}/produtos")
public class ProdutosController {
    private RepositoryProdutoMockup repository = new RepositoryProdutoMockup();

    @PostMapping
    public ResponseEntity<List<Produto>> create() {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PutMapping
    public ResponseEntity<String> update() {
        return ResponseEntity.status(HttpStatus.OK).body("Maçã!");
    }

    @DeleteMapping
    public ResponseEntity<String> delete() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Produto excluído!");
    }

}
