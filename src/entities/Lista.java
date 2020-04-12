package entities;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos;
	private int tam;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tam = 0;
	}

	public Lista(int capacidade, Class<T> tipo) {
		this.elementos = (T[]) Array.newInstance(tipo, capacidade);
		this.tam = 0;
	}

	public int ultimoIndice(Contato c) {
		for(int i = getTam() - 1; i >= 0; i--) {
			if(elementos[i].equals(c))
				return i;
		}
		return -1;
	}
	
	// aula 09 - Remover elemento do vetor
	public boolean remove(int index) {
		if (!(index < getTam() && index >= 0)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i = index; i < getTam() - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		incrementa(-1);
		return true;
	}

	// Aula 08 - Aumentar a capacidade do Vetor
	private void aumentaCapacidade() {
		if (getTam() == getCapacidade()) {
			T[] elementosNovos = (T[]) new Object[getCapacidade() * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// Aula 07 - Adicionar elemento em qualquer posição do vetor
	public boolean adiciona(T elem, int index) {
		try {
			aumentaCapacidade();
			if (!(index < getTam() && index >= 0)) {
				throw new Exception(); 
			} else {
				for (int i = getTam() - 1; i >= index; i--) {
					elementos[i + 1] = elementos[i];
				}
				elementos[index] = elem;
				incrementa(1);
				return true;
			}
		}catch(Exception e) {
			System.out.println("Posição inválida!");
			return false;
		}
	}

	// Aula 06 - Verificar se existe elemento no vetor
	public int busca(T elemento) {
		for (int i = 0; i < getTam(); i++) {
			if (elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}

	// Aula 05 - Adicionar elemento ao vetor
	public boolean adiciona(T elem) {
		aumentaCapacidade();
		if (getCapacidade() > getTam()) {
			this.elementos[getTam()] = elem;
			incrementa(1);
			return true;
		}
		return false;
	}

	public T busca(int pos) {
		if (!(pos >= 0 && pos <= getTam())) {
			System.out.println("Posição inválida!");
			return null;
		}
		return this.elementos[pos];
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < getTam() - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (getTam() > 0) {
			s.append(this.elementos[getTam() - 1]);
		}
		s.append("]");
		return s.toString();
	}

	public void remove(Contato contato) {
		for (int i = 0; i < getTam(); i++) {
			if(this.getObject(i).equals(contato))
				remove(i);
		}
	}
	
	public T getObject(int obj) {return elementos[obj];}
	public int getCapacidade() {return this.elementos.length;}
	private void incrementa(int i) {this.tam += i;}
	public int getTam() {return this.tam;}
}
