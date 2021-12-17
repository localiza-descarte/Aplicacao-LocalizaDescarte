package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio4_idadeParaVotar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int anoAtual, anoNascimento, idade = 0;

		System.out.println("\n----------------- Exercício 4 -----------------");
		System.out.println("\n----- Saiba se você poderá votar este ano -----");

		System.out.printf("\nDigite o ano atual: ");
		anoAtual = ler.nextInt();

		System.out.printf("\nDigite o o seu ano de nascimento: ");
		anoNascimento = ler.nextInt();

		idade += anoAtual - anoNascimento;

		if (anoAtual > 0 && anoNascimento > 0 && idade >= 16) {

			System.out.printf("\nDevido você ter: " + idade + " anos, você poderá votar esse ano!");

		} else if (anoAtual > 0 && anoNascimento > 0 && idade < 16) {

			System.out.printf("\nDevido você ter: " + idade + " anos, você não poderá votar esse ano!");

		} else {

			System.out.printf("\nA ação realizada é invalida!");
		}
	}
}
