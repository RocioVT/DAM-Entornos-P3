package main.java.ieseuropa;

public class Decimales {

	private static int eliminarDecimales(float num){
		return (int)(num);
	}
	private static int redondearAlza(float num) {
		return (int) Math.ceil(num);
	}
	private static float[] ecuacion2Grado(float a, float b , float c) {
		float raiz = (float) Math.sqrt(Math.pow(b, 2) -4 *a *c);
		
		return new float[] {(-b+raiz)/(2*a) ,(-b-raiz)/(2*a)};
	}
	public static void main(String[] args) {
		
		System.out.println("Eliminar decimales: "+eliminarDecimales(25.66f));
		System.out.println("Redondear al alza: "+redondearAlza(15.2f));
		float ecuacion[] = ecuacion2Grado(2f, -7f, 3f);
		System.out.println("Solucion 1:"+ecuacion[0]+ " Solucion 2:"+ecuacion[1]);
	}
		
}
