package entities;

public class Ex02 {
	
	public String name;
	public double salario;
	public double taxa = 1000.00;
	public int porcento;
	
	
	public double valorFinal() {
		return salario - taxa;
	}
	public String toString() {
		return "Perfil: " 
				+ name
				+ String.format("%nSalario: " + salario)
				+ String.format("%nMenos a Taxa de 1000.00 ")
				+ String.format("Valor final: %.2f", valorFinal());
	}
	public double attValor() {
		return valorFinal() + (salario * porcento) / 100; 
	}
}
