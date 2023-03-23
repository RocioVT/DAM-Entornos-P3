package main.java.ieseuropa;

public class Cadena {
	
	private static String cambiarMayusc(String texto) {
		return texto.toUpperCase();
	}
	
	private static String cambiarMinusc(String texto) {
		return texto.toLowerCase();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String texto = "MariCarmen";
	System.out.println(cambiarMayusc(texto));
	System.out.println(cambiarMinusc(texto));
	}
}
