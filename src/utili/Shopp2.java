package utili;

public class Shopp2 {
/*
	Fazer um programa para ler os dados de um produto em estoque (nome, preço e
	quantidade no estoque). Em seguida:
	• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
	• Realizar uma entrada no estoque e mostrar novamente os dados do produto
	• Realizar uma saída no estoque e mostrar novamente os dados do produto 
  */

	
	public String Name;
	public double price;
	public int quantidy_in_stock;
	
	public double total() {
		return price * quantidy_in_stock;
	}
	
	public void addProucts(int quantidy_in_stock) { // Altera o valor do atributo quantidy
		
		this.quantidy_in_stock += quantidy_in_stock; //This: Referencia o atributo da classe e não o parâmetro da função
		//quantidade do atributo += o parâmetro da função
	}
	
	public void removeProducts(int quantidy_in_stock) {
		
		this.quantidy_in_stock -= quantidy_in_stock;
	}
	
	public String toString() { //Sobrepõe os objetos 
		return Name
			+ ", $ "
			 //price com 2 casas:
			+ String.format("%.2f", price)
			+ ", "
			+ quantidy_in_stock 
			+ " units, Total: $ "
			+ String.format("%.2f", total());
	}
}
