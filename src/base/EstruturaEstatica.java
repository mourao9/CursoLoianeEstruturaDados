package base;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;
	
	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {this(10);}
	
	protected boolean adiciona(T elem) {
		aumentaCapacidade();
		if (getCapacidade() > getTamanho()) {
			this.elementos[getTamanho()] = elem;
			incrementa(1);
			return true;
		}
		return false;
	}
	
	protected boolean adiciona(T elem, int index) {
		try {
			aumentaCapacidade();
			if (!(index < getTamanho() && index >= 0)) {
				throw new Exception(); 
			} else {
				for (int i = getTamanho() - 1; i >= index; i--) {
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
	
	@SuppressWarnings("unchecked")
	private void aumentaCapacidade() {
		if (getTamanho() == getCapacidade()) {		
			T[] elementosNovos = (T[]) new Object[getCapacidade() * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < getTamanho() - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (getTamanho() > 0) {
			s.append(this.elementos[getTamanho() - 1]);
		}
		s.append("]");
		return s.toString();
	}
	
	public int getTamanho() {return this.tamanho;}
	public int getCapacidade() {return this.elementos.length;}
	protected void incrementa(int i) {this.tamanho+=i;} 
}
