import java.util.Scanner;

public class Problema_Sem_POO {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):

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
			System.out.println("O triângulo x é maior" + areax);
		}else {
			System.out.println("O triângulo y é maior" + areay);
		}
		
	}

}
