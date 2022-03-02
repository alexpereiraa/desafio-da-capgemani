package br.com.capgemini.desafio.funcoes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {

		String palavra;
		int valor;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra qualquer: ");
		palavra = scanner.next();
		valor = montaParesAnagrama(palavra);

		System.out.println(valor);
	}

	public static Integer montaParesAnagrama(String palavra) {

		HashMap<String, Integer> map = new HashMap<>();
		int a, b, tamanho = palavra.length();

		for (a = 0; a < tamanho; a++) {
			for (b = a; b < tamanho; b++) {
				char[] arrayPalavra = palavra.substring(a, b + 1).toCharArray();
				Arrays.sort(arrayPalavra);
				String chaveArrayPalavra = new String(arrayPalavra);
				if (map.containsKey(chaveArrayPalavra))
					map.put(chaveArrayPalavra, map.get(chaveArrayPalavra) + 1);
				else
					map.put(chaveArrayPalavra, 1);
			}
		}

		int paresAnagrama = 0;
		for (String chave : map.keySet()) {
			int x = map.get(chave);
			paresAnagrama += (x * (x - 1)) / 2;
		}
		return paresAnagrama;
	}
}
