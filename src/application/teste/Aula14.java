package application.teste;

import entities.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println("Está vazia: " + pilha.estaVazia());
		
		for (int i = 1; i <= 20; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println("tamanho: " + pilha.getTamanho());
	}

}
