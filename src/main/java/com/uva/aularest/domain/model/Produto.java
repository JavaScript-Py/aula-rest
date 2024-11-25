package com.uva.aularest.domain.model;

import jakarta.persistence.*;


@Entity
public class Produto {
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private Integer categoria;

    @Column(name = "loja_fisica")
    private String temLojaFisica;

    private Integer quantidade;

    private Float preco;

    @Column(name = "data_validade")
    private String dataValidade;

    private String descricao;

    //Construtor Vazio
    public Produto() {
        super();
    }

    //Construtor Cheio
    public Produto(String nome, Integer codigo, Integer categoria, String temLojaFisica, Integer quantidade, Float preco, String dataValidade, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.temLojaFisica = temLojaFisica;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.descricao = descricao;
    }

    public Produto(String nome, Integer categoria, String temLojaFisica, Integer quantidade, Float preco, String dataValidade, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.temLojaFisica = temLojaFisica;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.descricao = descricao;
    }

    //Getters
    public String getDescricao() {
        return descricao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public Float getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getTemLojaFisica() {
        return temLojaFisica;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public void setTemLojaFisica(String temLojaFisica) {
        this.temLojaFisica = temLojaFisica;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", categoria=" + categoria +
                ", temLojaFisica='" + temLojaFisica + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
