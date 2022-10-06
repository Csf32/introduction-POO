package Exercicio1_Fixacao;

public class Retangulo {
	
	/*Fazer um programa para ler os valores da largura e altura
	de um retângulo. Em seguida, mostrar na tela o valor de
	sua área, perímetro e diagonal. Usar uma classe como
	mostrado no projeto ao lado.*/
	
	
	public double width;
	public double height;
	public String result;
	
	public double Area() {
		return width * height;
		
	}
	
	public double Perimeter() {
		return width *2 + height *2;
	}
	
	public double Diagonal() {
		return Math.sqrt(height * height + width * width);
	}
	
	public String toString() {
		return result
				
			+ " "	
			+ "The Area is = "
			+ String.format("%.2f", Area())
			+ ","
			+ "The Perimeter is = "
			+ String.format("%.2f", Perimeter())
			+ ","
			+ "The Diagonal is = "
			+ String.format("%.2f", Diagonal());
			
	}
}
