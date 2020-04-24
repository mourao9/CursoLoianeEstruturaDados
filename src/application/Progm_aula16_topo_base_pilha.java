package application;

import entities.Pilha;

public class Progm_aula16_topo_base_pilha {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha();
		System.out.println(pilha);
		pilha.empilha(1);
		System.out.println(pilha);
		pilha.empilha(8);
		pilha.empilha(10);
		pilha.empilha(2);
		System.out.println(pilha);
		System.out.println(pilha.pop());
		System.out.println(pilha);
	}

}
