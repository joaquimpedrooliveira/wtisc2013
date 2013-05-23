package br.ufc.quixada.wtisc2013;

import java.math.BigDecimal;

public class Exemplo10 {

	public static void main(String args[]) {

		// Utilizando ponto flutuante
		double valor1 = 2.15;
		double valor2 = 1.10;
		System.out.println("A diferença entre 2.15 e 1.0 usando double é: "
				+ (valor1 - valor2));

		// Use BigDecimal para fazer cálculos com precisão
		BigDecimal valor3 = new BigDecimal("2.15");
		BigDecimal valor4 = new BigDecimal("1.10");
		System.out.println("A diferença entre 2.15 e 1.0 usando BigDecimal é: "
				+ (valor3.subtract(valor4)));
		
	}
}
