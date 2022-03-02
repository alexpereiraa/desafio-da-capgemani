package br.com.capgemini.desafio.funcoes;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {

		int numero;
		String escadaMontada;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um tamanho numérico para formar sua escada: ");
		numero = scanner.nextInt();
		escadaMontada = montaEscada(numero);

		System.out.println(escadaMontada);

	}

	public static String montaEscada(int numero) {

		int a;
		String escada = "";

		for (a = 1; a <= numero; a++) {
			escada += " ".repeat(numero - a) + "*".repeat(a) + "\n";
		}

		return escada;
	}
}
