package entities;

public class Estoque {
	
	private String name;
	private double preco;
	private int quantidade;
	
	
	public Estoque() {
		
	}
	
	public Estoque(String name, double preco, int quantidade) {
		super();
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Estoque(String name, double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}

	public double valorTotal() {
		return preco * quantidade;
		
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
		
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, total: $ "
			+ String.format("%.2f", valorTotal());
	}
}
