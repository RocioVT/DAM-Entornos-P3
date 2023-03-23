package main.java.ieseuropa;

public class Decimales {

	private static int eliminarDecimales(float num){
		return (int)(num);
	}
	private static int redondearAlza(float num) {
		return (int) Math.ceil(num);
	}
	public static void main(String[] args) {
		
		System.out.println("Eliminar decimales: "+eliminarDecimales(25.66f));
		System.out.println("Redondear al alza: "+redondearAlza(15.2f));
	}
		
}
