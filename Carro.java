package Aula2;

public class Carro {
private String cor;
private String modelo;
private double velocidadeAtual;
private double velocidadeMaxima=100;
boolean estado;
public void ligar(boolean estado) {
	estado=true;
	
}
	public boolean getEstado(){
		return estado= true;
	}



public double acelerar(double velocidadeAcrescentada, double velocidadeAtual) {
	
	
	velocidadeAtual=velocidadeAtual+velocidadeAcrescentada;
	if(velocidadeAtual>100){
		System.out.println("SUA VELOCIDADE MAXIMA FOI ATINGIDA");
	return velocidadeAtual;
	}
	return velocidadeAtual;
}
public double getVelocidadeMaxima() {
	return velocidadeMaxima;
}
public void setVelocidadeMaxima(int velocidadeMaxima) {
	this.velocidadeMaxima = velocidadeMaxima;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public double getVelocidadeAtual() {
	return velocidadeAtual;
}
public void setVelocidadeAtual(int velocidadeAtual) {
	this.velocidadeAtual = velocidadeAtual;;
}


public boolean estado() {
	return estado;
	
}


}
