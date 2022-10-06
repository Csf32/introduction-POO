import java.util.Scanner;

import entities.Triangle;

public class Problema_POO_Ajustado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the measures of triangle X");
	
		//No lugar dos Double a b e c, coloca-se as vari�veis x e y do tipo Triangle que est� dentro do pacote entities
		
		Triangle x, y; //CTRL + SHIFT + O para importar o pacote entities. Melhor que criar v�rios Double
		
		x = new Triangle(); // Criar o objeto (inst�ncias da classe)
		y = new Triangle();
		
		/*Guardar dentro do objeto que cont�m os as vari�veis a,b e c. � so acrescentar o objeto ao lado
		 * das vari�veis*/
		
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
			System.out.println("O tri�ngulo x � maior" + areax);
		}else {
			System.out.println("O tri�ngulo y � maior" + areay);
		}
		
	}

}