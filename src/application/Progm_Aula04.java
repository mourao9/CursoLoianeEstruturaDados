package application;

import entities.Vetor;

public class Progm_Aula04 {

	public static void main(String[] args) {
		Vetor v = new Vetor(15);
		
		v.adiciona("Elvis");
		v.adiciona("Barros");
		v.adiciona("Mourão");
		v.adiciona(" olá!");
		
		System.out.println("Tamanho: " + v.getTam());
		System.out.println(v);
		System.out.println("Valor: " + v.busca(0));
	}

}
