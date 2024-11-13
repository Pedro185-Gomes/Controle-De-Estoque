package Trabalho;

public class Roupa extends Produto{
	private String tamanho;
	
	@Override
	public String toString() {
		return "Roupa [nomeProduto: "+ nomeProduto + " ,preco: "+ preco +" ,marca: "+ marca + " ,tamanho=" + tamanho + "]";
	}

	public Roupa(String nomeProduto, float preco, String marca) {
		super(nomeProduto, preco, marca);
		// TODO Auto-generated constructor stub
	}

	public Roupa(String nomeProduto, float preco, String marca, String tamanho) {
		super(nomeProduto, preco, marca);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}