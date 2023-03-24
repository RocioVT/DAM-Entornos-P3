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


	private static int mediaArray(int[] array){
		int sumatorio = 0;
		for (int i = 0; i < array.length; i++) {
			sumatorio += array[i];
		}
		return sumatorio/array.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] numeros = {1,2,3,7,4,5};
		System.out.println(calcularMax(numeros));

		System.out.println("Hola");
		
		//Media
		int[] array = {8,2,3,4,4};
		System.out.println(mediaArray(array));

	}

}
