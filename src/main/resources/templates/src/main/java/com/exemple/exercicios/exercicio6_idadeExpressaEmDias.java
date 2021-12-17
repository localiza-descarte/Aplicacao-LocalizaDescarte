package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio6_idadeExpressaEmDias {

	public static void main(String[] args) {
		// Utilizando o Scanner para lê o que o usuário digitar e transmitir a variável
		Scanner ler = new Scanner(System.in);

		// Declarando as variáveis
		int anos, meses, dias, idade;

		System.out.println("\n-------------- Exercício 6 --------------");
		System.out.println("\n- Saiba a idade expressa somente em dias -");
		// Solicitando ao usuário o input na variável inteira: anos
		System.out.printf("\nDigite quantos anos de vida: ");
		anos = ler.nextInt();
		// Solicitando ao usuário o input na variável inteira: meses
		System.out.printf("\nDigite quantos meses de vida: ");
		meses = ler.nextInt();
		// Solicitando ao usuário o input na variável inteira: dias
		System.out.printf("\nDigite quantos dias de vida: ");
		dias = ler.nextInt();

		// Condicional para poder expressar a idade em dias
		if (anos >= 0) {
			// Expressão para determinar os anos expressos em dias
			anos = anos * 365;
			// Expressão para determinar os meses expressos em dias
			meses = meses * 30;
			// Expressão que determina que idade expressa em dias é a soma de 
			//anos representados em dias + meses + os dias adicionais
			idade = anos + meses + dias;

			// Exibindo o resultado ao usuário
			System.out.println("\nSua idade é: " + idade + " dias");

		// Caso não seja verdadeira a condição
		} else {
			// Exibindo o resultado ao usuário de ação inválida
			System.out.println("\nEntrada inválida");
		}

	}

}
