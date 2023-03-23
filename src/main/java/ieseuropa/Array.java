package main.java.ieseuropa;

public class Array {
	
	private static int calcularMax(int[] numeros) {
		int mayor = 0;
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {1,2,3,7,4,5};
		System.out.println(calcularMax(numeros));
	}

}
