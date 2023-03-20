package main.java.ieseuropa;

public class Numero {

	private static boolean armstrong(int num) {
		String numCadena= Integer.toString(num);
		int numDigitos=numCadena.length();
		double suma=0;
		for(int i=0; i<numDigitos;i++) {
			int cifra=Character.getNumericValue(numCadena.charAt(i));
			double potencia=Math.pow(cifra, numDigitos);
			suma+=potencia;
		}
		if(suma==num) {
			return true;
		}else {
		return false;	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		System.out.println(armstrong(num));
	}

}
