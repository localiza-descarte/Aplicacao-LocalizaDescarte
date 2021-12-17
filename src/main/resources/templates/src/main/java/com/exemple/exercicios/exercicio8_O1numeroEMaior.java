package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio8_O1numeroEMaior {

	public static void main(String[] args) {
		// Utilizando o Scanner para lê o que o usuário digitar e transmitir a variável
		Scanner ler = new Scanner(System.in);
		// Declarando váriavel float Arrey (vetor) de 3 posições para armazenar os 3 números
		float[] numeros = new float[3];
		// Declarando várial float soma para guardar a soma do número 2 e 3
		float soma;

		System.out.println("---------------------- Exercício 8 ----------------------");
		System.out.println("Saiba se o 1° número é maior do que a soma dos 2° últimos");
		// Criando uma estrutura Para, com um contador para exibir ao 
		// usuário o "Digite o seu número" as 3 vezes e armazenar o número float no arrey
		for (int contador = 0; contador < numeros.length; contador++) {
				
			System.out.printf("\nDigite o " + (contador + 1) + "° número: ");
			numeros[contador] = ler.nextFloat();
		}
		// Encerrando o Scanner 
		ler.close();
		// Expressão para somar o a posição 2 e 3 do arrey e guardar na variável soma
		soma = numeros[1] + numeros[2];
		// Primeira condicional se (if) caso o número 1 (posição 0 do arrey) seja maior que a soma do número 2 e 3
		if (numeros[0] > numeros[1] + numeros[2]) {
			// Exibindo o resultado ao usuário
			System.out.printf("\nO 1° número: " + numeros[0] + ", é maior que a soma dos dois últimos: " + numeros[1]
					+ " + " + numeros[2] + " = " + soma);
		// Segunda condicional senao se (else if) caso o número 1 (posição 0 do arrey) seja menor que a soma do número 2 e 3
		} else if (numeros[0] < numeros[1] + numeros[2]) {
			// Exibindo o resultado ao usuário
			System.out.printf("\nA soma dos 2° últimos números: " + numeros[2] + " + " + numeros[1] + " = " + soma
					+ ", é maior que o 1° número: " + numeros[0]);
		// Terceira condicional senao se (else if) caso o número 1 (posição 0 do arrey) seja igual a soma do número 2 e 3
		} else if (numeros[0] == numeros[1] + numeros[2]) {
			// Exibindo o resultado ao usuário
			System.out.printf("\nA soma dos 2° últimos números: " + numeros[2] + " + " + numeros[1] + " = " + soma
					+ ", é igual ao 1° número: " + numeros[0]);
		}
	}
}