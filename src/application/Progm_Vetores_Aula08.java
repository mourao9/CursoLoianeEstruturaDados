package application;

import entities.Vetor;

public class Progm_Vetores_Aula08 {

	public static void main(String[] args) {
		Vetor v = new Vetor(2);
		v.adiciona("A");
		v.adiciona("B");
		v.adiciona("C");
		v.adiciona("D");
		v.adiciona("E");
		
		/*
		System.out.println(v);
		System.out.println(v.getTam());
		
		v.adiciona("F");
		
		mostrar(v);
		System.out.println(v.getTam());
		*/
		
		int p = v.busca("D");
		
		System.out.println(v.remove(p));
		mostrar(v);
		System.out.println(v.getTam());
		
	}
	public static void mostrar(Vetor v) {
		System.out.println(v);
	}
}
