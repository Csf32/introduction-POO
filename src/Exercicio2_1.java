import java.util.Scanner;

import utili.Shopp2;

public class Exercicio2_1 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		quantidade no estoque). Em seguida:
		• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
		• Realizar uma entrada no estoque e mostrar novamente os dados do produto
		• Realizar uma saída no estoque e mostrar novamente os dados do produto 
	  */
		
		Scanner sc = new Scanner(System.in);		
		
		Shopp2 products = new Shopp2(); //Chama a classe (Shopp), cria a variável products e por fim o objeto new Shopp
		System.out.println("Enter product data: " );
		 
		System.out.print("Name: "  );
		products.Name = sc.next(); //Armazena o nome dentro do objeto
		
		System.out.print("Price: ");
		products.price = sc.nextDouble();
		
		System.out.print("Quantidy in stock: ");
		products.quantidy_in_stock = sc.nextInt();
		
		//Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
		
		System.out.println();
		System.out.print(products.toString()); /*Em vez de digitar tudo, usa o toString para substituir
		inserir Strings dentro do objeto e poder retornar resultados */
			
		//Enter the number of products to be added in stock: 5
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantidy_in_stock = sc.nextInt();
		products.addProucts(quantidy_in_stock);
		
		System.out.println();
		System.out.print("Update data:" + products.toString());
		
		//Enter the number of products to be removed from stock: 3
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantidy_in_stock = sc.nextInt();
		products.removeProducts(quantidy_in_stock);
		
		System.out.println();
		System.out.print("Update data:" + products.toString());
				
		sc.close();
	}

}
