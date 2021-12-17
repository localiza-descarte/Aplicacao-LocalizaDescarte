package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio3_estoqueDoProduto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int quantAtual, quantMax, quantMin;
		float quantMed = 0;
		String produto;
		
		System.out.println("\n----------------- Exercício 3 -----------------");
		System.out.println("\n------- Controle de estoque de produtos -------");
		
		System.out.printf("\nDigite o nome do produto: ");
		produto = ler.next();
		
		System.out.printf("\nDigite a quantidade atual do produto em estoque: ");
		quantAtual = ler.nextInt();
		
		System.out.printf("\nDigite a quantidade máxima para o produto em estoque: ");
		quantMax = ler.nextInt();
		
		System.out.printf("\nDigite a quantidade mínima para o produto em estoque: ");
		quantMin = ler.nextInt();
		
		quantMed += (quantMax + quantMin) / 2;
		
		if (quantAtual >= quantMed && quantAtual <= quantMax) {
			
			System.out.println("\nNão efetuar compra do produto");
		
		} else if (quantAtual < quantMed) {
			System.out.println("\nEfetuar compra");
			
		} else if (quantAtual > quantMax || quantMax <= 0) {
			
			System.out.println("\nCapacidade excedida");
		}
	}
}
