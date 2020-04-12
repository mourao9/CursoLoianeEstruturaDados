package application;

import java.util.Scanner;

import entities.Contato;
import entities.Lista;
import util.GeradorDados;

public class Exerc_06 {
	public static final String SUCESSO = "Ação realizada com sucesso!";
	public static final String ERRO = "Ação mal sucedida!";
	public static final String ENT_INVALIDA = "Entrada inválida!";
	public static final String POS_LISTA = "Digite a posição da lista: ";
	public static final String SEPARADOR = "=======================================================";
	
	
	public static void main(String[] args) {
		// Criação das variáveis
		Scanner sc = new Scanner(System.in);

		// Criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);

		// Criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);
		//imprimirLista(lista);

		// Criar um menu para que o usuário escolha a opção
		boolean naorepete = false;
		while(!naorepete) {
			
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
				buscaUltimoIndice(sc, lista);
				break;
			case 6:
				verificarContatoExiste(sc, lista);
				break;
			case 7:
				removerPorPosicao(sc, lista);
				break;
			case 8:
				removerContato(sc, lista);
				break;
			case 9:
				tamanho(lista);
				break;
			case 10:
				limpar(lista);
				break;
			case 11:
				imprimirLista(lista);
				break;
			case 0:
				naorepete = true;
				mensagem("Até logo!");
				break;
			default:
				break;
			}
		}
		sc.close();
	}
	
	protected static void removerContato(Scanner sc, Lista<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc);
		
		Contato contato = lista.busca(pos);
		
		lista.remove(contato);
	}

	protected static void limpar(Lista<Contato> lista) {
		for(int i = 0; i < lista.getTam(); i++) {
			lista.remove(i);
		}
	}

	protected static void tamanho(Lista<Contato> lista) {
		mensagem("Tamanho: "+lista.getTam());
	}

	protected static void removerPorPosicao(Scanner sc, Lista<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc); 
		
		if(lista.remove(pos))
			mensagem(SUCESSO);
		else
			mensagem(ERRO);
	}

	protected static void verificarContatoExiste(Scanner sc, Lista<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc); 
		
		Contato contrato = lista.busca(pos);
		
		if(contrato != null) {
			mensagem("Contato encontrado!");
		}else {
			mensagem("Contato não encontrado!");
		}
		
	}

	protected static void buscaUltimoIndice(Scanner sc, Lista<Contato> lista) {
		
		int pos = lerInfoInt(POS_LISTA, sc); 
		
		if(pos != -1) {
			mensagem("Contato encontrado!");
			mensagem(""+lista.ultimoIndice(lista.busca(pos)));
		}else {
			mensagem("Contato não encontrado!");
		}
		
	}

	protected static void buscarPorContato(Scanner sc, Lista<Contato> lista) {
		
		int pos = lerInfoInt(POS_LISTA, sc); 
		
		if(pos != -1) {
			mensagem("Contato encontrado!");
			imprimirContato(lista.busca(pos));
		}else {
			mensagem("Contato não encontrado!");
		}
	}
	
	protected static void buscarContatoPosicao(Scanner sc, Lista<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc);
		imprimirContato(lista.busca(pos));
	}
	
	protected static void adicionarContatoNoFinal(Scanner sc, Lista<Contato> lista) {
		String nome = lerInfoString("Nome: ", sc);
		String tele = lerInfoString("Telefone: ", sc);
		String email = lerInfoString("E-mail: ", sc);
		
		lista.adiciona(new Contato(nome, tele, email));
		
		mensagem(SUCESSO);
	}
	
	protected static void mensagem(String msg) {
		System.out.println(msg);
	}
	
	protected static void adicionarContatoPosicao(Scanner sc, Lista<Contato> lista) {
		int pos = lerInfoInt(POS_LISTA, sc);
		
		String nome = lerInfoString("Nome: ", sc);
		String tele = lerInfoString("Telefone: ", sc);
		String email = lerInfoString("E-mail: ", sc);
		
		lista.adiciona(new Contato(nome, tele, email), pos);
		
		mensagem(SUCESSO);
	}
	
	
	protected static int lerInfoInt(String msg, Scanner sc) {
		boolean naorepete = false;
		int num = 0;
		while(!naorepete) {
			try {
				System.out.print(msg);
				String entrada = sc.nextLine();
				num = Integer.parseInt(entrada);
				naorepete = true;
			}catch(Exception e) {
				mensagem(SEPARADOR);
				mensagem(ENT_INVALIDA);
				mensagem(SEPARADOR);
			}
		}
		return num;
	}
	
	protected static String lerInfoString(String msg, Scanner sc) {
		System.out.print(msg);
		String entrada = sc.nextLine();
		
		return entrada;
	}
	

	protected static int obterOpcaoMenu(Scanner sc) {
		String entrada = "";
		boolean loop = false;
		int op = 0;
		
			System.out.println("============================================");
			System.out.println("(01) - Adiciona contato no final");
			System.out.println("(02) - Adiciona contato em uma posição");
			System.out.println("(03) - Buscar contato por posição");
			System.out.println("(04) - Buscar por contato");
			System.out.println("(05) - Buscar último índice do contato");
			System.out.println("(06) - Verifica se contato existe");
			System.out.println("(07) - Remove por posição");
			System.out.println("(08) - Remove contato");
			System.out.println("(09) - Verificar tamanho do vetor");
			System.out.println("(10) - Excluir todos os contatos do vetor");
			System.out.println("(11) - Imprimir Lista");
			System.out.println("(0) - Sair");
			System.out.println("============================================");
			
			op = lerInfoInt("DIGITE A OPÇÃO DESEJADA: ", sc);

		return op;
	}

	protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		for (int i = 0; i < quantidade; i++) {
			lista.adiciona(new Contato(GeradorDados.nome(), GeradorDados.telefone(), GeradorDados.email()));
		}
	}

	protected static void imprimirContato(Contato c) {
		System.out.println(c);
	}
	
	protected static void imprimirLista(Lista<Contato> l) {
		for (int i = 0; i < l.getTam(); i++) {
			imprimirContato(l.getObject(i));
		}
	}
}
