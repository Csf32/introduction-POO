import java.util.Locale;
import java.util.Scanner;

import utilVFinal.Calculator_VFinal;

public class Membros_Estáticos_Vfinal {

	public static void main(String[] args) {
		/*Fazer um programa para ler um valor numérico qualquer
		e mostrar quanto seria o valor de uma circunferência e do volume
		de uma esfera para um raio daquele valor. Informar tambpem o valor de 
		PI com duas casas decimais.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator_VFinal CalcFinal = new Calculator_VFinal();
		System.out.println("Enter number");
		
		double radius = sc.nextDouble();
				
		double c = CalcFinal.circumferencefinal(radius);
		double v = CalcFinal.volumefinal(radius);
		System.out.printf("Circunference is, %.2f", c);
		System.out.println();
		System.out.printf("Volume is, %.2f", v);
		System.out.println();
		System.out.printf("O valor de Pi é, %.5f", CalcFinal.PIf);
		
		sc.close();

	}

}
