package br.com.lojinha.pojo;

public class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() { return this.nome; }
    public void setNome(String novoNome) { this.nome = novoNome; }

    public int getQuantidade() { return this.quantidade; }
    public void setQuantidade(int novaQuantidade) { this.quantidade = novaQuantidade; }
}
