package util;

import java.util.Random;

public final class GeradorDados {
	public static String[] nomes = {
			"Miguel", "Arthur", "Heitor", "Bernardo", "Th�o", "Davi",
			"Gabriel", "Pedro", "Samuel", "Lorenzo",
			"Benjamin", "Matheus", "Lucas", "Ben�cio",
			"Gael", "Joaquim", "Nicolas", "Henrique",
			"Rafael", "Isaac", "Guilherme", "Murilo",
			"Lucca", "Gustavo", "Jo�o Miguel", "Noah",
			"Felipe", "Anthony", "Enzo", "Jo�o Pedro",
			"Pietro", "Bryan", "Daniel", "Pedro Henrique",
			"Enzo Gabriel", "Leonardo", "Vicente", "Valentim",
			"Eduardo", "Ant�nio", "Emanuel", "Davi Lucca",
			"Bento", "Jo�o", "Jo�o Lucas", "Caleb",
			"Levi", "Vitor", "Enrico", "Cau�",
			"Caio", "Vin�cius", "Henry", "Jo�o Gabriel",
			"Augusto", "Ravi", "Francisco", "Ot�vio",
			"Davi Lucas", "Jo�o Guilherme",
			"Thomas", "�caro", "Theodoro", "Jo�o Vitor", 
			"Luiz Miguel", "Yan", "Yuri Thiago", "Arthur Miguel",
			"Nathan", "Erick", "Breno", "Luiz Felipe",
			"Anthony Gabriel", "Martin", "Matteo", "Oliver",
			"Arthur Gabriel", "Ryan", "Raul", "Luan", "Tom�s",
			"Mathias", "Davi Luiz", "Pedro Lucas", "Derick"
	};
	public static String[] alfa = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "x", "z" };
	static Random rand = new Random();

	public static String email() {
		String r = "";
		int b = 0;

		for (int i = 0; i < 6; i++) {
			b = rand.nextInt(23);
			r += alfa[b];
		}

		return r + "@gmail.com";
	}

	public static String nome() {
		return nomes[rand.nextInt(nomes.length)];
	}

	public static String telefone() {

		return "(" + rand.nextInt(9) + rand.nextInt(9) + ") " + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9)
				+ rand.nextInt(9) + " " + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);
	}
}
