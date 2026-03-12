package com.produto.produto.Model;

import com.produto.produto.Enum.StatusProduto;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidadeEmEstoque;
    private StatusProduto statusProduto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public StatusProduto getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(StatusProduto statusProduto) {
        this.statusProduto = statusProduto;
    }
}
