package util;

import java.util.Random;

public final class GeradorDados {
	public static String[] nomes = {
			"Miguel", "Arthur", "Heitor", "Bernardo", "Théo", "Davi",
			"Gabriel", "Pedro", "Samuel", "Lorenzo",
			"Benjamin", "Matheus", "Lucas", "Benício",
			"Gael", "Joaquim", "Nicolas", "Henrique",
			"Rafael", "Isaac", "Guilherme", "Murilo",
			"Lucca", "Gustavo", "João Miguel", "Noah",
			"Felipe", "Anthony", "Enzo", "João Pedro",
			"Pietro", "Bryan", "Daniel", "Pedro Henrique",
			"Enzo Gabriel", "Leonardo", "Vicente", "Valentim",
			"Eduardo", "Antônio", "Emanuel", "Davi Lucca",
			"Bento", "João", "João Lucas", "Caleb",
			"Levi", "Vitor", "Enrico", "Cauã",
			"Caio", "Vinícius", "Henry", "João Gabriel",
			"Augusto", "Ravi", "Francisco", "Otávio",
			"Davi Lucas", "João Guilherme",
			"Thomas", "Ícaro", "Theodoro", "João Vitor", 
			"Luiz Miguel", "Yan", "Yuri Thiago", "Arthur Miguel",
			"Nathan", "Erick", "Breno", "Luiz Felipe",
			"Anthony Gabriel", "Martin", "Matteo", "Oliver",
			"Arthur Gabriel", "Ryan", "Raul", "Luan", "Tomás",
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
