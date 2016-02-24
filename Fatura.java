package JavaE1;

public class Fatura {

private String numero;
private String descrição;
private int quantidade;
private double preco;
	

public String getDescrição() {
	return descrição;
}
public void setDescrição(String descrição) {
	this.descrição = descrição;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public double getValorFatura(double valor ,double preco,int quantidade) {
	if(valor<0){
		valor=0;
	}
	if(preco<0){
		preco=0.0;
	}
	return valor=quantidade*preco;

	
}
}
