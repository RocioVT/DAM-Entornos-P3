
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
	private static String repetirStrings(String cadena1, String cadena2, int rep) {
		String cadenaRep="";
		for(int i=0; i<rep;i++) {
			cadenaRep+=cadena1+"\n"+cadena2+"\n";
		}
		
		return cadenaRep;
	}
	private static String repetirLetras(String texto) {
		String repetido="";
		int repeticiones=2;
		for(int i=0;i<texto.length();i++) {
			for(int j=0;j<repeticiones;j++) {
				repetido+=texto.charAt(i);	
			}
		}
		
		return repetido;
	}
	private static String borrarCadena(String cadena, String borrado) {
		String cadenaFin=cadena.replace(borrado, "");
		return cadenaFin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Mari Carmen";
		System.out.println(calcularLongitud(texto));
		System.out.println(cambiarMayusc(texto));
		System.out.println(cambiarMinusc(texto));
		String letra = "a";
		System.out.println(calcularOcurrenciasLetra(texto, letra));
		System.out.println(repetirStrings("Hola", "Hamijo",3));
		System.out.println(repetirLetras("Rock&Stone4ever"));
		System.out.println(borrarCadena("si si si, creanme que es asi","si"));
	}

}

