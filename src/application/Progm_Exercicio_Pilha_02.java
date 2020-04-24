package application;

import java.util.Scanner;

import entities.Pilha;

public class Progm_Exercicio_Pilha_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pilha<Integer> pPar = new Pilha();
		Pilha<Integer> pImpar = new Pilha();

		int loop = 1;

		while (loop <= 10) {
			System.out.print("Digite um n�mero: ");
			int numero = sc.nextInt();
			
			System.out.println("============================================");
			
			if (numero == 0) {
				if (!pPar.estaVazia()) {
					System.out.println("Desempilhando " + pPar.desempilha());
				} else {
					System.out.println("Pilha par vazia!");
				}
				if (!pImpar.estaVazia()) {
					System.out.println("Desempilhando " + pImpar.desempilha());
				} else {
					System.out.println("Pilha �mpar vazia!");
				}
			} else if (numero % 2 == 0) {
				System.out.print("N�mero par, empilhando o n�mero " + numero);
				System.out.println();
				pPar.empilha(numero);
			} else {

				System.out.println("N�mero �mpar, empilhando o n�mero " + numero);
				pImpar.empilha(numero);
			}
			loop++;
		}
		
		System.out.println("============================================");
		System.out.println("N�meros pares: " + pPar);
		System.out.println("N�meros �mpares: " + pImpar);
		System.out.println("============================================");
		
		System.out.println("Todos os n�meros foram lidos, desempilhando n�meros da pilha");
		System.out.println("============================================");

		while (!pPar.estaVazia()) {
			System.out.println("Desempilhando n�mero par: " + pPar.desempilha());
		}
		System.out.println("============================================");
		while (!pImpar.estaVazia()) {
			System.out.println("Desempilhando n�mero �mpar: " + pImpar.desempilha());
		}
		System.out.println("============================================");

		System.out.println("Todos foram desempilhados.");
	}

}
