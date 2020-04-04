package application;

import entities.Contato;
import entities.VetorObjetos;

public class Progm_aula10 {

	public static void main(String[] args) {
		VetorObjetos v = new VetorObjetos(3);
				
		
		v.adiciona(new Contato("elvis", "(86) 99411-6996", "elvis@"));
		v.adiciona(new Contato("Rita", "(86) 98411-6796", "rita@"));
		v.adiciona(new Contato("Antonio", "(86) 98876-3156", "antonio@"));
		
		System.out.println("Tam: " + v.getTam());
		System.out.println(v);
		
		Contato z1 = (Contato) v.getObject(0);
		
		v.adicionar(z1, 2);
		System.out.println(v);
		
		v.remove(0);
		System.out.println(v);
	}

}
