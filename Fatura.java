package JavaE1;

public class Fatura {

private String numero;
private String descri��o;
private int quantidade;
private double preco;
	

public String getDescri��o() {
	return descri��o;
}
public void setDescri��o(String descri��o) {
	this.descri��o = descri��o;
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
