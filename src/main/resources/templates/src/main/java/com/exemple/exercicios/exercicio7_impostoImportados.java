package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio7_impostoImportados {

	public static void main(String[] args) {
		// Utilizando o Scanner para lê o que o usuário digitar e transmitir a variável
		Scanner ler = new Scanner(System.in);
		// Declarando as variáveis tipo float (ponto flutuante)
		float valor1, valor2, ipi, valorTotal;
		// Declarando as variáveis tipo int (Inteiro)
		int quant1, quant2;
		// Declarando as variáveis tipo string (texto/caracteres)
		String codigo1, codigo2;

		System.out.println("------------------------ Exercício 7 ----------------------");
		System.out.println("- Calcule o valor total a ser pago com o acréscimo do IPI -");
		// Solicitando ao usuário o input na variável float: ipi 
		System.out.printf("\nDigite a porcentagem do IPI: ");
		ipi = ler.nextFloat();
		// Solicitando ao usuário o input na variável string: codigo1
		System.out.printf("Digite o código da 1° peça: ");
		codigo1 = ler.next();
		// Solicitando ao usuário o input na variável float: valor1
		System.out.printf("Digite o valor unitário da 1° peça: ");
		valor1 = ler.nextFloat();
		// Solicitando ao usuário o input na variável int: quant1
		System.out.printf("Digite a quantidade da 1° peça: ");
		quant1 = ler.nextInt();
		// Solicitando ao usuário o input na variável string: codigo2
		System.out.printf("\nDigite o código da 2° peça: ");
		codigo2 = ler.next();
		// Solicitando ao usuário o input na variável float: valor2
		System.out.printf("Digite o valor unitário da 2° peça: ");
		valor2 = ler.nextFloat();
		// Solicitando ao usuário o input na variável int: quant2
		System.out.printf("Digite a quantidade da 2° peça: ");
		quant2 = ler.nextInt();
		// Expressão para calcular o valor total de imposto nos importados
		valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
		// Exibindo ao usuário o resultado
		System.out.println("\nO valor total a ser pago: R$" + valorTotal);
	}
}
