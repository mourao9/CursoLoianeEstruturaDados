package application;

import entities.Vetor;

public class Progm_Vetores_Aula07 {

	public static void main(String[] args) {
		Vetor v = new Vetor(10);
		
		v.adiciona("B");
		v.adiciona("C");
		v.adiciona("D");
		v.adiciona("E");
		v.adiciona("F");
		
		System.out.println(v);
		
		v.adicionar("A", 0);
		
		System.out.println(v);
	}

}
