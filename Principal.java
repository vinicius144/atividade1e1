package Aula2;

public class Principal {
	public static void main(String[] args) {
		
		Carro meucarro;
		meucarro = new Carro();
		meucarro.estado();
		meucarro.setVelocidadeMaxima(50);
		meucarro.ligar(true);
	System.out.println(meucarro.acelerar(100,5));

		
	}
}
