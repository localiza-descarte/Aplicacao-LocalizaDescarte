package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio5_caluladoraDeComissao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float vendasCarros, valorVendasTotal, salarioFixo, comissao, salarioFinal;
		
		System.out.println("\n-------------------- Exercício 5 --------------------");
		System.out.println("\n-- Calculadora de ganho final do vendedor de carro --");

		System.out.println("\nDigite o número de carros vendidos:");
		vendasCarros = ler.nextFloat();
		
		System.out.println("\nDigite o valor total das vendas: R$");
		valorVendasTotal = ler.nextFloat();
		
		System.out.println("\nDigite o salário fixo: R$");
		salarioFixo = ler.nextFloat();
		
		System.out.println("\nDigite o valor da comissão:");
		comissao = ler.nextFloat();
		
		salarioFinal = (float) (salarioFixo + vendasCarros * (comissao /100) + (valorVendasTotal *0.05));
		
		System.out.printf("\nO salário final do vendedor esse mês é de: R$"+salarioFinal);
		
	}
}

