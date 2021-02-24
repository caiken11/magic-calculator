package calculator;

public class MagicCalculator extends Calculator {
	
	public static double sqroot (double num1) {
		double result = Math.sqrt(num1);
		return result;
	}
	public static double sin (double num1) {
		double result = Math.sin(num1);
		return result;
	}
	public static double cosine(double num1) {
		double result = Math.cos(num1);
		return result;
	}
	public static double tangent(double num1) {
		double result = Math.tan(num1);
		return result;
	}
	public static int factorial(int num1) {
		int result = 1;
		for(int i = num1; i>0; i--) {
			result = result*i;
		}
		return result;
	}

	public static void main(String[] args) {
		//System.out.println(add(3, 5));

	}

}
