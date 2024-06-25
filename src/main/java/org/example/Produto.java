package org.example;

import java.time.LocalDate;

public class Produto {

    private Integer id;
    private String nome;
    private Integer quantidade;
    private Double valor;
    private LocalDate dataCadastro;

    public Produto(Integer id, String nome, Integer quantidade, Double valor, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataCadastro = dataCadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // Sobrescrever o método toString para formatar a exibição do produto
    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Quantidade: %d | Valor: %.2f | Data de Cadastro: %s",
                id, nome, quantidade, valor, dataCadastro);
    }
}
