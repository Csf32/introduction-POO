import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {
	
	//O final, define um valor como constante
	public static final double PI = 3.1459;
	
	public static void main(String[] args) {
	/*Fazer um programa para ler um valor numérico qualquer
		e mostrar quanto seria o valor de uma circunferência e do volume
		de uma esfera para um raio daquele valor. Informar tambpem o valor de 
		PI com duas casas decimais.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		
		System.out.printf("Circunference is, %.2f", c);
		System.out.println();
		System.out.printf("Volume is, %.2f", v);
		System.out.println();
		System.out.printf("O valor de Pi é, %.5f", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
	}
}
