package com.produto.produto.Controller;

import com.produto.produto.Model.Produto;
import com.produto.produto.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProduto(){
        return produtoService.listarProdutos();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return produtoService.cadastrarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@RequestBody Produto produto, @PathVariable Long id){
        return produtoService.atualizarProduto(produto,id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id){
        produtoService.deleteProduto(id);
        return ResponseEntity.noContent().build();
    }
}
