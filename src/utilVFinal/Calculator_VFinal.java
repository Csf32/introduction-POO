package utilVFinal;

public class Calculator_VFinal {

	public static final double PIf = 3.145;
	
	public static double  circumferencefinal(double radius) {
		 return 2.0 * PIf * radius;
		
	}
	
	public static double volumefinal(double radius) {
		return 4.0 * PIf * Math.pow(radius, 3.0) / 3.0;
	}
}
