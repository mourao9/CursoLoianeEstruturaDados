package entities;

import base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{
	
	
	public Lista2() {super();}
	
	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	@Override
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	@Override
	public boolean adiciona(T elemento, int pos) {
		return super.adiciona(elemento, pos);
	}
}
