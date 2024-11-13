package Trabalho;

public class Tenis extends Produto {
	
	private int numero;
	private String modelo;
	
	public Tenis(String nomeProduto, float preco, String marca) {
		super(nomeProduto, preco, marca);
		// TODO Auto-generated constructor stub
	}

	public Tenis(String nomeProduto, float preco, String marca, int numero, String modelo) {
		super(nomeProduto, preco, marca);
		this.numero = numero;
		this.modelo = modelo;
		
	}

	@Override
	public String toString() {
		return "Tenis [ nomeProduto: " + nomeProduto + " ,preco: "+ preco +" ,marca: " + marca+ " numero: " + numero + ", modelo: " + modelo + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
