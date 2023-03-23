package main.java.ieseuropa;

public class Numero {

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
		
		System.out.println(calcularHora(24543));
	}
}
