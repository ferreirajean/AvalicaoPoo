package org.example;


public class Main {
    public static void main(String[] args) {

        Camisa camisas = new Camisa();

        camisas.setCor("Azul");
        camisas.setTamanho("M");
        camisas.setPreco(100);

        camisas.ExibirDetalhes();
        camisas.CalcularDesconto();

        System.out.println();

        Camisa camisaEstampada = new Camisa();
        camisaEstampada.setCor("Vermelho");
        camisaEstampada.setTamanho("G");
        camisaEstampada.setPreco(150.00);

        camisaEstampada.ExibirDetalhes();
        camisaEstampada.CalcularDesconto();
    }
}