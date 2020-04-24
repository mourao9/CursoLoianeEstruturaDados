package application;

import java.util.Scanner;

import entities.Livro;
import entities.Pilha;

public class Progm_Exercicio_Pilha_03 {

	public static void main(String[] args) {
		Pilha<Livro> pilha = new Pilha<Livro>(20);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 1; i++) {
			String nome = pegaDados("Digite o nome do livro: ", sc);
			String isbn = pegaDados("Digite o isbn do livro: ", sc);
			int ano = Integer.parseInt(pegaDados("Digite o ano do livro: " , sc));
			String autor = pegaDados("Nome do autor: ", sc);
			
			pilha.empilha(new Livro(nome, isbn, ano, autor));
		}
		
	    System.out.println(pilha);
	    System.out.println(pilha.estaVazia());
	    System.out.println(pilha.desempilha());
		
		sc.close();
	}
	
	public static String pegaDados(String msg, Scanner sc) {
		System.out.print(msg);
		return sc.nextLine();
	}

}
