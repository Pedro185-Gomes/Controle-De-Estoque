package Trabalho;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		List<Produto> lista= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		char tipo;
		
	    do {
	    	System.out.println("Menu: ");
			System.out.println("1-Cadastrar Produto: ");
			System.out.println("2-Editar Produto: ");
			System.out.println("3-Remover Produto: ");
			System.out.println("4-Listar produto pelo preço: ");
			System.out.println("5-Ordenar produto: ");
			System.out.println("6-Sair");
			System.out.print("Selecione uma categoria: ");
		    tipo = scan.next().charAt(0);
				
	   if (tipo == '1') {
		   System.out.print("Quantos produtos você quer cadastar? ");
		   int quantProdutos = scan.nextInt();
		   for (int i=1; i<=quantProdutos; i++) {
			   System.out.print("Digite o nome do produto que você quer cadastrar: ");
			   String nomeProduto = scan.next();
			   System.out.print("Digite o preço do produto: ");
			   float preco = scan.nextFloat();
			   System.out.print("Digite a marca do produto:");
			   String marca= scan.next();
			   System.out.println("Digite a categoria do produto: ");
			   System.out.println("1-Roupa: ");
			   System.out.println("2-Tenis: ");
			   char tipoProduto = scan.next().charAt(0);
			   
			   if(tipoProduto == '1') {
				   System.out.print("Digite o tamanho que você deseja colocar no estoque: ");
				   String tamanho = scan.next();
				   lista.add(new Roupa(nomeProduto, preco, marca,tamanho));  
			   }
			   else if(tipoProduto == '2'){
				   System.out.print("Digite a numeração que você deseja adicionar ao estoque: ");
				   int numero = scan.nextInt();
				   System.out.print("Digite a categoria do tenis: ");
				   String modelo = scan.next();
				   lista.add(new Tenis(nomeProduto, preco, marca, numero, modelo));   
			   }
		}		
	}
	   else if (tipo == '2') {
           System.out.print("Digite o nome do produto que você quer editar: ");
           String nomeProduto = scan.next();
           boolean encontrado = false;

           for (Produto produto : lista) {
               if (produto.getNomeProduto().equals(nomeProduto)) {
                   System.out.print("Digite o novo preço do produto: ");
                   float preco = scan.nextFloat();
                   produto.setPreco(preco);  
                   System.out.println("Produto editado com sucesso!");
                   encontrado = true;
                    }   
	   }	   
           }
	   else if(tipo == '3'){
		   System.out.println("Digite o nome do produto que deseja excluir: ");
		   String nomeProduto = scan.next();
		
		   boolean produtoRemovido = false;
		   for(Produto produto: lista){
			  if(produto.getNomeProduto().equals(nomeProduto)) {
				  lista.remove(produto);
				  System.out.println("Produto :" + nomeProduto + "Removido! ");
				  produtoRemovido = true;
			  }
		   }
		       		  		   	      }
	   else if (tipo == '4') {
		    System.out.print("Digite o preço máximo para listar os produtos: ");
		    float precoMaximo = scan.nextFloat();

		    boolean encontrouProduto = false;
		    System.out.println("Produtos com preço até " + precoMaximo + ":");
		    for (Produto produto : lista) {
		        if (produto.getPreco() <= precoMaximo) {
		            System.out.println("Nome: " + produto.getNomeProduto() +
		                               ", Preço: " + produto.getPreco() +
		                               ", Marca: " + produto.getMarca());
		            encontrouProduto = true;
		        }
		    }
		    if (!encontrouProduto) {
		        System.out.println("Nenhum produto encontrado abaixo do preço especificado.");
		    }
		}
	   else if  (tipo=='5'){
		   System.out.println("Escolha a categoria para ordenar: ");
		   System.out.println("1-Roupa: ");
		   System.out.println("2-Tenis: ");
		   char categoria = scan.next().charAt(0);
		   
		   if (categoria =='1'){
			   lista.sort((p1,p2)->p1.getNomeProduto().compareToIgnoreCase(p2.getNomeProduto()));
		   }
		   else if(categoria=='2') {
			   lista.sort((p1,p2)->Float.compare(p1.getPreco(), p2.getPreco()));
		   }
		   System.out.println("Lista ordenada: ");
		   for(Produto produto:lista) {
			   System.out.printf("Nome: %s, Preço: %.2f, Marca: %s\n", produto.getNomeProduto(), produto.getPreco(), produto.getMarca());
			   
			   
		   }
	   }
	   else if(tipo =='6'){
		   System.out.println("Saindo! ");
		   
	   }else {
		   System.out.println("Comando desconhecido! ");																											   
		   }	   
	   System.out.println("Lista de produtos cadastrados: ");
	   for (Produto produto:lista) {
		   System.out.println(produto);		   
	   } 
      }while (tipo !='6');
	   }}