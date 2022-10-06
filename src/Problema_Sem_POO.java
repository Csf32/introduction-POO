import java.util.Scanner;

public class Problema_Sem_POO {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
possui a maior �rea.

A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a
seguinte (f�rmula de Heron):

	area = sqrt p( p - a)( p - b)( p - c) = (a+b+c)/2
*/
	
	Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Enter the measures of triangle X");
	
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y");
		
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double p1 = (xa+xb+xc) / 2;
		
		double areax = Math.sqrt(p1*(p1-xa)*(p1-xb)*(p1-xc));
		
		System.out.printf("%.2f%n", areax);
		
		double p2 = (ya+yb+yc) / 2;
		
		double areay = Math.sqrt(p2*(p2-ya)*(p2-yb)*(p2-yc));
		
		System.out.printf("%.2f%n", areay);
		
		if(areax > areay) {
			System.out.println("O tri�ngulo x � maior" + areax);
		}else {
			System.out.println("O tri�ngulo y � maior" + areay);
		}
		
	}

}
