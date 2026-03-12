package com.produto.produto.Service;

import com.produto.produto.Model.Produto;
import com.produto.produto.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
       return produtoRepository.findAll();
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deleteProduto(Long id){
        produtoRepository.deleteById(id);
    }

    public Produto atualizarProduto(Produto produtoModel, Long id){

        Produto produto = produtoRepository.findById(id)
                .orElse(new Produto());

        produto.setId(id);
        produto.setNome(produtoModel.getNome());
        produto.setPreco(produtoModel.getPreco());
        produto.setQuantidadeEmEstoque(produtoModel.getQuantidadeEmEstoque());
        produto.setStatusProduto(produtoModel.getStatusProduto());

        return produtoRepository.save(produto);
    }
}
