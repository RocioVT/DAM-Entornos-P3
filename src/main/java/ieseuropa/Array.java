package main.java.ieseuropa;

import java.util.Arrays;

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
	
	private static int medianaArray(int[] array) {
		Arrays.sort(array);
		int numeroCentral = array.length/2;
		if(array.length % 2 != 0) {
			return array[numeroCentral];
		}else {
			return (array[numeroCentral-1]+array[numeroCentral])/2;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] numeros = {1,2,3,7,4,5};
		System.out.println(calcularMax(numeros));

		System.out.println("Hola");
		
		//Media
		int[] array = {8,2,3,4,10};

		System.out.println("Media: "+mediaArray(array));
		//Mediana
		System.out.println("Mediana: "+medianaArray(array));

	}

}
