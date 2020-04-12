package application;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Fatorial
		// 8! => 8*7*6*5*4*3*2*1

		System.out.print("Calcule o fatorial: ");
		int f = Integer.parseInt(sc.nextLine());

		//int r = fatorial(f);

		int r = fatorial2(f);

		
		System.out.println("O resultado é: " + r);

		sc.close();
	}

	private static int fatorial(int f) {
		int num = f;

		if (num == 1)
			return 1;

		return num * fatorial(num -= 1);
	}

	private static int fatorial2(int f) {
		int r = 1;
		for (int i = f; i > 0; i--) {
			r *= i;
		}
		return r;
	}

}
