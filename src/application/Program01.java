package application;

import entities.Vetor;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor v = new Vetor(3);
		
		v.adiciona("Elvis");
		v.adiciona("Barros");
		v.adiciona("Mour�o");
		v.adiciona(" % ");
		System.out.println(v.toString());
	}

}
