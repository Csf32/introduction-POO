package entities;

public class Triangle {
	//Problema com POO
	
	//Declara��o de atributos da classe
	
	public double a; //Public indica que pode ser usado em outro arquivo
	public double b;
	public double c;
	//Adicionar fun��o para o c�lculo de p
	
	public double area() {
		double p = (a + b + c) / 2.0;
		/*double result = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return result;
		
		OU:*/
		
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
	
	
}
