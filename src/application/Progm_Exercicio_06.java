package application;

import java.util.Iterator;
import java.util.Random;

import entities.Contato;
import entities.VetorObjetos;

public class Progm_Exercicio_06 {

	public static void main(String[] args) {
		VetorObjetos v = new VetorObjetos(20);

		for (int i = 0; i < 30; i++) {
			v.adiciona(new Contato("" + nome(), "" + telefone(), "" + email() + "@"));
		}

		mostrar(v);
	}

	public static String email() {
		String[] alfa = { "a", "b", "c", "d", 
				  "e", "f", "g", "h", 
				  "i", "j", "l", "m", 
				  "n", "o", "p", "q", 
				  "r", "s", "t", "u", 
				  "v", "x", "z" };
		String r = "";
		int b = 0;
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			b = rand.nextInt(23);
			r += alfa[b];
		}

		return r;
	}

	public static String nome() {
		String[] alfa = { "a", "b", "c", "d", 
						  "e", "f", "g", "h", 
						  "i", "j", "l", "m", 
						  "n", "o", "p", "q", 
						  "r", "s", "t", "u", 
						  "v", "x", "z" };
		String r = "";
		int b = 0;
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			b = rand.nextInt(23);
			r += alfa[b];
		}

		return r;
	}
	
	public static String telefone() {		
		Random r = new Random();
		
		return "("+r.nextInt(9)+r.nextInt(9)+") "+
				  r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+" "+
				  r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+r.nextInt(9);
	}

	public static void mostrar(VetorObjetos v) {
		for (int i = 0; i < v.getTam(); i++) {
			System.out.println(v.busca(i));
		}
	}
}
