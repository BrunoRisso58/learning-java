package br.com.lojinha.interfaces;

public interface Favorito {
    // qualquer classe que "assine" esse contrato deve criar um método que retorne os dados favoritos (nome, marca e valor)
    String getDadosFavoritos();
}
