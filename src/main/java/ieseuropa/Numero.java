package main.java.ieseuropa;

import java.util.ArrayList;

public class Numero {
	private static ArrayList<Integer> seriePell() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		for (int i = 2; i < 15; i++) {
			int nuevo = lista.get(i - 2) + (lista.get(i - 1) * 2);
			lista.add(nuevo);
		}
		return lista;
	}

	private static boolean armstrong(int num) {
		String numCadena = Integer.toString(num);
		int numDigitos = numCadena.length();
		double suma = 0;
		for (int i = 0; i < numDigitos; i++) {
			int cifra = Character.getNumericValue(numCadena.charAt(i));
			double potencia = Math.pow(cifra, numDigitos);
			suma += potencia;
		}
		if (suma == num) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		System.out.println(armstrong(num));

		ArrayList<Integer> prueba = seriePell();
		for (int i = 0; i < prueba.size(); i++) {
			System.out.println(prueba.get(i));
		}
		System.out.println(esPrimo(7));

	}

}