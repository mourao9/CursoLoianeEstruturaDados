package application;

import java.util.Scanner;

import entities.Pilha;

public class Progm_Exercicio_Pilha_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = {1,34,5,76,2,9,54,90,11,4};

		Pilha<Integer> pilha = new Pilha();
			
		int loop = 1;
		
		while(loop <= 10) {
			System.out.print("Digite um n�mero: ");
			int numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				System.out.print("Empilhando o n�mero " + numero);
				System.out.println();
				pilha.empilha(numero);
			}else {
				if(pilha.estaVazia()) {
					System.out.println("Pilha vazia!");
				}else {
					System.out.println("N�mero �mpar, desempilha " + numero);
					pilha.desempilha();
				}
			}
			loop++;
		}
		System.out.println(pilha);
		
		System.out.println("Todos os n�meros foram lidos, desempilhando n�meros da pilha");
		
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando " + pilha.desempilha());
		}
		System.out.println("Todos foram desempilhados.");
	}

}
