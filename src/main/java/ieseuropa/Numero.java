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

	private static boolean isLucky (int n) {
		int contador=2;
		do {
		if(contador > n)  
			return true;  
		if(n%contador == 0)  
			return false;     
			n = n-(n/contador);  
			contador++;
		}while(contador>0);
	return true;	
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

	private static int calcularFactorial(int num) {
		if (num < 0) {
			System.out.println("No se puede hacer el factorial de un negativo");
		}
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	private static String calcularHora(int num) {
		int horas = num / 3600;
		int segundos = num % 3600;
		int minutos = segundos / 60;
		segundos = segundos % 60;
		String hora = String.valueOf(horas + "hs ").concat(String.valueOf(minutos + "mins "))
				.concat(segundos + "segs ");
		return hora;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		System.out.println(armstrong(num));




		ArrayList<Integer> prueba = seriePell();
		for (int i = 0; i < prueba.size(); i++) {
			System.out.println(prueba.get(i));
		}

		
		int suerteSi=7;
		int suerteNo=8;
		System.out.println(isLucky(suerteSi)+" "+isLucky(suerteNo));

		System.out.println(esPrimo(7));
		System.out.println(calcularFactorial(5));
		System.out.println(calcularHora(24543));
	}
}

