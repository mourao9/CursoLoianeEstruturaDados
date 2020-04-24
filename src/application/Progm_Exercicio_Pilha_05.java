package application;

import java.util.Scanner;
import java.util.Stack;

import entities.Livro;
import entities.Pilha;

public class Progm_Exercicio_Pilha_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		imprime("ADA");
		imprime("QASD");
		imprime("Ovo");

		sc.close();
	}

	private static void imprime(String p) {
		System.out.println("======================================");
		if (isPolidromo(p))
			System.out.println("A palavra \"" + p + "\" É palídromo.");
		else
			System.out.println("A palavra \"" + p + "\" NÂO é palídromo.");
	}

	public static boolean isPolidromo(String palavra) {
		String p = palavra;

		Pilha<Character> pilha = new Pilha<>();

		for (int i = 0; i < p.length(); i++) {
			pilha.empilha(p.charAt(i));
		}

		String comp = "";

		while (!pilha.estaVazia()) {
			comp += pilha.desempilha();
		}

		if (!p.equalsIgnoreCase(comp))
			return false;
		return true;
	}
}
