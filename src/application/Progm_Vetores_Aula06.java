package application;

import entities.Vetor;

public class Progm_Vetores_Aula06 {

	public static void main(String[] args) {
		Vetor v = new Vetor(10);
		
		v.adiciona("Elvis");
		v.adiciona("Barros");
		v.adiciona("Mourão");
		
		int i = v.busca("Elvis");
		int j = v.busca("lvis");
		
		System.out.println(i);
		System.out.println(j);

	}

}
