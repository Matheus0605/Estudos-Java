package entities;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.nome = name;
		this.salario = salary;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salario;
	}

	public void setSalary(Double salary) {
		this.salario = salario;
	}
		
	public void aumento(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f",salario);
	}
}
