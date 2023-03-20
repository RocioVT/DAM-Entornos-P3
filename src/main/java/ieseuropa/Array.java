package main.java.ieseuropa;

public class Array {

	private static int min(int[] lista) {
		int  min=Integer.MAX_VALUE;
		for (int i=0; i<lista.length;i++) {
			if(lista[i]<min) {
				min =lista[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[]lista={2,4,1,5,6};
		System.out.println(min(lista));
		
	}

}
