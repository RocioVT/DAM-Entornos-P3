package main.java.ieseuropa;

import java.util.ArrayList;

public class Numero {
	private static ArrayList<Integer> seriePell() {
		ArrayList<Integer> lista =new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		for (int i=2;i<15;i++) {
			int nuevo=lista.get(i-2)+(lista.get(i-1)*2);
			lista.add(nuevo);
		}
		return lista;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> prueba=seriePell();
		for (int i=0; i<prueba.size();i++) {
			System.out.println(prueba.get(i));
		}
	}

}
