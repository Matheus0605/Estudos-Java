package entities;

public class Ex03 {
		
	public String name;
	public double a,b,c;
	
	public double notaFinal() {
		return a + b + c;
	}
	
	public String toString() {
		return "Nota Final: "
				+ String.format("%.2f%n", notaFinal());
	}
	
	public double reprova() {
		return 60 - notaFinal();
	}
}
