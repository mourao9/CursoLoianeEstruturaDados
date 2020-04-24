package application;

import java.util.Scanner;
import java.util.Stack;

import entities.Livro;
import entities.Pilha;

public class Progm_Exercicio_Pilha_04 {

	public static void main(String[] args) {
		Stack<Livro> pilha = new Stack<Livro>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 1; i++) {
			String nome = pegaDados("Digite o nome do livro: ", sc);
			String isbn = pegaDados("Digite o isbn do livro: ", sc);
			int ano = Integer.parseInt(pegaDados("Digite o ano do livro: " , sc));
			String autor = pegaDados("Nome do autor: ", sc);
			
			pilha.push(new Livro(nome, isbn, ano, autor));
		}
		
	    System.out.println(pilha);
	    System.out.println(pilha.size());
	    System.out.println(pilha.peek());
	    System.out.println(pilha.isEmpty());
	    System.out.println(pilha.pop());
		
		sc.close();
	}
	
	public static String pegaDados(String msg, Scanner sc) {
		System.out.print(msg);
		return sc.nextLine();
	}

}
