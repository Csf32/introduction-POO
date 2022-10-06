import java.util.Scanner;

import entities.Triangle;

public class Problema_POO_Ajustado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the measures of triangle X");
	
		//No lugar dos Double a b e c, coloca-se as variáveis x e y do tipo Triangle que está dentro do pacote entities
		
		Triangle x, y; //CTRL + SHIFT + O para importar o pacote entities. Melhor que criar vários Double
		
		x = new Triangle(); // Criar o objeto (instâncias da classe)
		y = new Triangle();
		
		/*Guardar dentro do objeto que contém os as variáveis a,b e c. É so acrescentar o objeto ao lado
		 * das variáveis*/
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Troca pelos objetos
		
		double p1 = (x.a+x.b+x.c) / 2;
		
		double areax = Math.sqrt(p1*(p1-x.a)*(p1-x.b)*(p1-x.c));
		
		System.out.printf("%.2f%n", areax);
		
		double p2 = (y.a+y.b+y.c) / 2;
		
		double areay = Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));
		
		System.out.printf("%.2f%n", areay);
		
		if(areax > areay) {
			System.out.println("O triângulo x é maior" + areax);
		}else {
			System.out.println("O triângulo y é maior" + areay);
		}
		
	}

}