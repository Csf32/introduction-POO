import java.util.Scanner;

import utili.Shopp;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		quantidade no estoque). Em seguida:
		• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
		• Realizar uma entrada no estoque e mostrar novamente os dados do produto
		• Realizar uma saída no estoque e mostrar novamente os dados do produto 
	  */
		
		Scanner sc = new Scanner(System.in);		
		
		Shopp products = new Shopp(); //Chama a classe (Shopp), cria a variável products e por fim o objeto new Shopp
		System.out.println("Enter product data: " );
		 
		System.out.print("Name: "  );
		products.Name = sc.next(); //Armazena o nome dentro do objeto
		
		System.out.print("Price: ");
		products.price = sc.nextDouble();
		
		System.out.print("Quantidy in stock: ");
		products.quantidy_in_stock = sc.nextInt();
		
		//Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
		
		
		System.out.print("Product data: " + products.Name + "," + " $ " + products.price + "," +
		products.quantidy_in_stock + " units " + "," );
		
		
		
		
		
		
		
		sc.close();
	}

}
