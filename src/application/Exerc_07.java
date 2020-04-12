package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contato;
import entities.Lista;
import util.GeradorDados;

public class Exerc_07 extends Exerc_06 {

	public static void main(String[] args) {
		// Criação das variáveis
		Scanner sc = new Scanner(System.in);

		// Criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		// Criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);
		// imprimirLista(ArrayList);

		// Criar um menu para que o usuário escolha a opção
		boolean naorepete = false;
		while (!naorepete) {

			int opcao = obterOpcaoMenu(sc);

			switch (opcao) {
			case 1:
				adicionarContatoNoFinal(sc, lista);
				break;
			case 2:
				adicionarContatoPosicao(sc, lista);
				break;
			case 3:
				buscarContatoPosicao(sc, lista);
				break;
			case 4:
				buscarPorContato(sc, lista);
				break;
			case 5:
				//buscaUltimoIndice(sc, lista);
				break;
			case 6:
				//verificarContatoExiste(sc, lista);
				break;
			case 7:
				//removerPorPosicao(sc, lista);
				break;
			case 8:
				//removerContato(sc, lista);
				break;
			case 9:
				//tamanho(lista);
				break;
			case 10:
				//limpar(lista);
				break;
			case 11:
				//imprimirLista(lista);
				break;
			case 0:
				naorepete = true;
				mensagem("Até logo!");
				break;
			default:
				break;
			}
		}
	}

	protected static void buscarPorContato(Scanner sc, ArrayList<Contato> lista) {

		int pos = lerInfoInt(POS_LISTA, sc);

		if (pos != -1) {
			mensagem("Contato encontrado!");
			imprimirContato(lista.get(pos));
		} else {
			mensagem("Contato não encontrado!");
		}
	}

	private static void buscarContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc);
		imprimirContato(lista.get(pos));
	}

	private static void adicionarContatoNoFinal(Scanner sc, ArrayList<Contato> lista) {
		String nome = lerInfoString("Nome: ", sc);
		String tele = lerInfoString("Telefone: ", sc);
		String email = lerInfoString("E-mail: ", sc);

		lista.add(new Contato(nome, tele, email));

		mensagem(SUCESSO);
	}

	public static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		for (int i = 0; i < quantidade; i++) {
			lista.add(new Contato(GeradorDados.nome(), GeradorDados.telefone(), GeradorDados.email()));
		}
	}

	protected static String lerInfoString(String msg, Scanner sc) {
		System.out.print(msg);
		String entrada = sc.nextLine();

		return entrada;
	}

	private static void adicionarContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc);

		String nome = lerInfoString("Nome: ", sc);
		String tele = lerInfoString("Telefone: ", sc);
		String email = lerInfoString("E-mail: ", sc);

		lista.add(pos, new Contato(nome, tele, email));

		mensagem(SUCESSO);
	}
}
