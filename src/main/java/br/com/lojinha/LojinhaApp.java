package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Item;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestlé", Tamanho.GRANDE);
        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(30);

        List<Item> itensInclusos = new ArrayList<>();
        Item item1 = new Item("Controle", 1);
        itensInclusos.add(item1);
        Item item2 = new Item("Jogos", 3);
        itensInclusos.add(item2);

        meuProduto.setItensAdicionais(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        // à esquerda, como cada item será chamado
        // à direita, a lista que o for percorrerá
        for (Item itemAtual : meuProduto.getItensAdicionais()) {
            System.out.println(itemAtual.getQuantidade() + " " + itemAtual.getNome());
        }
        System.out.println("Acabaram-se os itens!");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.PEQUENO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        meuProdutoNacional.setValor(30);
        meuProdutoNacional.setNome("Playstation 2");
        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getValor());
        System.out.println(meuProdutoNacional.getDadosFavoritos());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutoInternacional.setTaxaImportacao(2.345);
        meuProdutoInternacional.setValor(-10);
        meuProdutoInternacional.setNome("Playstation 3");
        System.out.println(meuProdutoInternacional.getTaxaImportacao());
        System.out.println(meuProdutoInternacional.getValor());
        System.out.println(meuProdutoInternacional.getDadosFavoritos());

    }
}
