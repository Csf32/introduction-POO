import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Membros_Estáticos_v2 {
		
		public static void main(String[] args) {
		/*Fazer um programa para ler um valor numérico qualquer
			e mostrar quanto seria o valor de uma circunferência e do volume
			de uma esfera para um raio daquele valor. Informar tambpem o valor de 
			PI com duas casas decimais.*/
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			/*Como os membros da classe Calculator, não são statics, então é preciso instanciar um objeto aqui*/
			
			//Instanciou (new = Calculator) o tipo Calculator para criar o objeto calc
			
			Calculator calc = new Calculator(); 
			System.out.println("Enter number");
			double radius = sc.nextDouble();
			
			double c = calc.circumference(radius);
			double v = calc.volume(radius);
			
			
			System.out.printf("Circunference is, %.2f", c);
			System.out.println();
			System.out.printf("Volume is, %.2f", v);
			System.out.println();
			System.out.printf("O valor de Pi é, %.5f", calc.PI);
			
			sc.close();
		}
		

}
