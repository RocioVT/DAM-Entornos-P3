package main.java.ieseuropa;

public class Cadena {

	private static int calcularLongitud(String texto) {
		String textoModificado = texto.replace(" ", "");
		return textoModificado.length();
	}

	private static String cambiarMayusc(String texto) {
		return texto.toUpperCase();
	}

	private static String cambiarMinusc(String texto) {
		return texto.toLowerCase();
	}

	private static int calcularOcurrenciasLetra(String texto, String letra) {
		int contOcurrencias = 0;
		char letraChar = letra.toLowerCase().charAt(0);
		for (int i = 0; i < texto.length(); i++) {
			if (texto.toLowerCase().charAt(i) == letraChar) {
				contOcurrencias++;
			}
		}
		return contOcurrencias;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Mari Carmen";
		System.out.println(calcularLongitud(texto));
		System.out.println(cambiarMayusc(texto));
		System.out.println(cambiarMinusc(texto));
		String letra = "a";
		System.out.println(calcularOcurrenciasLetra(texto, letra));
	}
}
