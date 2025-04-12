package org.example;

public class Camisa {
    private String cor;
    private String tamanho;
    private double preco;

    public Camisa(){
    }

    public Camisa(String tamanho, String cor, double preco) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void ExibirDetalhes() {

        System.out.println("Cor da camisa: " + this.cor);
        System.out.println("Tamanho da camisa: " + this.tamanho);
        System.out.println("Valor da camisa: " + this.preco);
    }

    public  double CalcularDesconto(){
             return preco - (preco * 0.1);
    }
}
