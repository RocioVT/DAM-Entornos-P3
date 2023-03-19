package main.java.ieseuropa;

public class Array {
	private static int mediaArray(int[] array){
		int sumatorio = 0;
		for (int i = 0; i < array.length; i++) {
			sumatorio += array[i];
		}
		return sumatorio/array.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		
		//Media
		int[] array = {8,2,3,4,4};
		System.out.println(mediaArray(array));
	}

}
