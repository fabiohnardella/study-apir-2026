package br.com.fiap.study_apir_2026.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutosController {

    @GetMapping
    public String getProdutos() {
        return "Produto criado!";
    }

    @PostMapping
    public String create() {
        return "Produto criado!";
    }

    @GetMapping("{id}")
    public String findById() {
        return "Maçã!";
    }

    @PutMapping
    public String update() {
        return "Produto atualizado!";
    }

    @DeleteMapping
    public String delete() {
        return "Produto excluído!";
    }

}
