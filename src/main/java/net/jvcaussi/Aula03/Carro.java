package net.jvcaussi.Aula03;

public class Carro {
    
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private double velocidade;

    public Carro(String marca, String modelo, int anoFabricacao, int anoModelo, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.velocidade = velocidade;
    }

    public void acelerar(double num){
        this.velocidade += num;
    }

    public void frear(double num) {
        this.velocidade -= num;
    }

    public double mostrarVelocidadeAtual(){
        return velocidade;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo(){
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo){
        this.anoModelo = anoModelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
