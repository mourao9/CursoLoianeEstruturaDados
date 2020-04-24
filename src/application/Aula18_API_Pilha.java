package application;

import java.util.Stack;

import entities.Pilha;

public class Aula18_API_Pilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}

}
