package org.example;

public class CamisetaEstampada extends Camisa{
    private String estampa;

    public CamisetaEstampada(){

    }

    public CamisetaEstampada(String estampa) {
        this.estampa = estampa;
    }

    public CamisetaEstampada(String tamanho, String cor, double preco, String estampa) {
        super(tamanho, cor, preco);
        this.estampa = estampa;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    public void ExibirDetalhes() {
        System.out.println("Tio de Estampa: " + this.estampa);
    }
    public  double CalcularDesconto(){
        return getPreco();

    }

}
