package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values?: ");
		int n = sc.nextInt();

		// Ler os valores
		for (int cont = 0; cont < n; cont++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("First: " + ps.first());

		sc.close();
	}
}