package application;

import entities.Contato;
import entities.Pilha;

public class Progm_aula14 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha();
		
		for(int i = 1; i <= 11; i++) {
			pilha.empilha(i);
		}

		System.out.println(pilha);
		System.out.println("Tamanho: " + pilha.getTamanho());
	}
}
