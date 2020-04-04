package entities;

public class Vetor {

	private String[] elementos;
	private int tam;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tam = 0;
	}

	// aula 09 - Remover elemento do vetor
	public String remove(int index) {
		String e = "";
		if (!(index < getTam() && index >= 0)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}
		e = elementos[index];
		for (int i = index; i < getTam() - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		incrementa(-1);
		return e;
	}

	// Aula 08 - Aumentar a capacidade do Vetor
	private void aumentaCapacidade() {
		if (getTam() == getCapacidade()) {
			String[] elementosNovos = new String[getCapacidade() * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// Aula 07 - Adicionar elemento em qualquer posi��o do vetor
	public void adicionar(String elem, int index) {
		aumentaCapacidade();
		if (!(index < getTam() && index >= 0)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		} else {
			for (int i = getTam() - 1; i >= index; i--) {
				elementos[i + 1] = elementos[i];
			}
			elementos[index] = elem;
			incrementa(1);
		}
	}

	// Aula 06 - Verificar se existe elemento no vetor
	public int busca(String elemento) {
		for (int i = 0; i < getTam(); i++) {
			if (elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}

	// Aula 05 - Adicionar elemento ao vetor
	public void adiciona(String elem) {
		aumentaCapacidade();
		if (getCapacidade() > getTam()) {
			this.elementos[getTam()] = elem;
			incrementa(1);
		}
	}

	public String busca(int pos) {
		if (!(pos < getTam() && pos >= 0)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
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

	public int getCapacidade() {
		return this.elementos.length;
	}

	private void incrementa(int i) {
		this.tam += i;
	}

	public int getTam() {
		return this.tam;
	}
}
