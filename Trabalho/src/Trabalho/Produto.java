package Trabalho;

public abstract class Produto {

	protected String nomeProduto;
	protected float preco;
	protected String marca;
	
	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", preco=" + preco + ", marca=" + marca + "]";
	}

	public Produto(String nomeProduto, float preco, String marca) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.marca = marca;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}	
}
