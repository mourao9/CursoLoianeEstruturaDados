package entities;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	private int topo, base;

	public Pilha(int capacidade) {
		super(capacidade);
		this.base = this.topo = 0;
	}
	
	public Pilha() {
		super();
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
		this.topo = this.getTamanho() - 1;
	}
	
	public T desempilha() {
		T elemento = null;
		if(!this.estaVazia()) {
			elemento = this.elementos[this.topo];
			super.excluirUm();
			this.topo--;
		}
		return elemento; 
	}
	
	public T pop() {
		if(this.estaVazia()) {
			return null;
		}
		this.topo--;
		return this.elementos[--this.tamanho];
	}
	
	public T topo() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[this.topo];
	}
	
	private T base() {
		return this.elementos[this.base];
	}
	
}
