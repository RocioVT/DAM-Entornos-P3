package main.java.ieseuropa;

public class Numero {

	public static int calcularFactorial(int num) {
		if (num < 0) {
			System.out.println("No se puede hacer el factorial de un negativo");
		}
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(calcularFactorial(5));
	}
}
