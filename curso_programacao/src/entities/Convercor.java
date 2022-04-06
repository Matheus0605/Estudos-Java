package entities;

public class Convercor {
	
	public static double cotadolar, compra, valor;
	
	public static double valorDeCompra() {
		valor = (compra * cotadolar);
		return valor += (valor * 6) / 100;
	}
}