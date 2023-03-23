package main.java.ieseuropa;

public class Cadena {

	private static int calcularLongitud (String texto) {
		String textoModificado = texto.replace(" ", "");
		return textoModificado.length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Mari Carmen";
		System.out.println(calcularLongitud(texto));
	}
}
