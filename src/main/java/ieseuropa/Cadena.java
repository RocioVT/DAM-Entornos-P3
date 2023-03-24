package main.java.ieseuropa;

public class Cadena {

	
	private static String repetirStrings(String cadena1, String cadena2, int rep) {
		String cadenaRep="";
		for(int i=0; i<rep;i++) {
			cadenaRep+=cadena1+"\n"+cadena2+"\n";
		}
		
		return cadenaRep;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(repetirStrings("Hola", "Hamijo",3));
	}

}
