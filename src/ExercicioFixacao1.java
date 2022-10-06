import java.util.Scanner;

import Exercicio1_Fixacao.Retangulo;

public class ExercicioFixacao1 {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como
		mostrado no projeto ao lado.*/
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.result = sc.next();
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		System.out.print(retangulo.toString());
		
		sc.close();
	}

}
