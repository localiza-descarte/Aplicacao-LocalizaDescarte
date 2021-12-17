package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio2_porcentDeEleitores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int totalEleitores, votosBrancos, votosNulos, votosValidos;
		float percentualBrancos = 0, percentualNulos = 0, percentualValidos = 0;

		System.out.println("\n----------------- Exercício 2 -----------------");
		System.out.println("\n------ *Descubra o percentual de votos* ------");

		System.out.printf("\n- Informe o número total de eleitores? ");
		totalEleitores = ler.nextInt();

		System.out.printf("\n- Informe o número de votos brancos? ");
		votosBrancos = ler.nextInt();

		System.out.printf("\n- Informe o número de votos nulos? ");
		votosNulos = ler.nextInt();

		System.out.printf("\n- Informe o número de votos válidos? ");
		votosValidos = ler.nextInt();

		if (totalEleitores == votosBrancos + votosNulos + votosValidos) {

			percentualBrancos += (votosBrancos * 100 / totalEleitores);
			System.out.println("\n- Percentual de votos brancos: " + percentualBrancos + "%");

			percentualNulos += (votosNulos * 100 / totalEleitores);
			System.out.println("\n- Percentual de votos nulos: " + percentualNulos + "%");

			percentualValidos += (votosValidos * 100 / totalEleitores);
			System.out.println("\n- Percentual de votos válidos: " + percentualValidos + "%");

		} else {
			System.out.println("\nA ação realizada não é válida");
		}
	}
}
