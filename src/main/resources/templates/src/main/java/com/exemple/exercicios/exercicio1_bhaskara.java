package com.exemple.exercicios;

import java.util.Scanner;

public class exercicio1_bhaskara {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double delta, valorA, valorB, valorC, r1, r2;

		System.out.println("\n----------- Exercício 1 -----------");
		System.out.println("\n------ Fórmula de Bhaskara ------");
		System.out.println("\n- Descubra as raizes da equação -");

		System.out.printf("\nDigite o A: ");
		valorA = ler.nextDouble();

		System.out.printf("\nDigite o B: ");
		valorB = ler.nextDouble();

		System.out.printf("\nDigite o C: ");
		valorC = ler.nextDouble();

		delta = (Math.pow(2, valorB)) - (4 * valorA + valorC);

		if (delta < 0) {

			System.out.printf("\nImpossível calcular!");

		} else if (delta == 0) {

			r1 = (valorB * (-1)) / (2 * valorA);

			System.out.printf("\nDelta = " + delta);
			System.out.printf("\nr1 = r2 = %.5f", r1);

		} else {

			r1 = ((valorB * (-1)) + Math.sqrt(delta)) / 2 * valorA;
			r2 = ((valorB * (-1)) - Math.sqrt(delta)) / 2 * valorA;

			System.out.printf("\nr1 =  %.5f", r1);
			System.out.printf("\nr2 = %.5f", r2);
		}
	}
}
