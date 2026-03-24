package br.com.fiap.study_apir_2026.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.study_apir_2026.model.Produto;

public class RepositoryProdutoMockup {
    private List<Produto> produtos = new ArrayList<>();

    public RepositoryProdutoMockup() {
        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Maçã");
        Produto produto2 = new Produto();
        produto2.setId(30L);
        produto2.setNome("Banana");

        produtos.add(produto1);
        produtos.add(produto2);

    }

    public List<Produto> findAll() {
        return produtos;
    }

    public Produto findById(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

}
