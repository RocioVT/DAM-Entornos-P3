package main.java.ieseuropa;

public class Cadena {

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
		String letra = "a";
		System.out.println(calcularOcurrenciasLetra(texto, letra));
	}
}
