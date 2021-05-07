package com.loiane.cursojavabasico.aula8;

import java.util.Scanner;

public class TesteCircunferencia {

	public static void main(String[] args) {
		// calcular a circunferencia

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor da area:");
		float raio = scan.nextFloat();

		float n = 3.14159f;
		float area = (raio * raio) * n;

		System.out.print("O valor da area é " + area);

	}

}
