package br.ufc.quixada.wtisc2013;

import java.util.HashSet;
import java.util.Set;

import equalsHashcode.Produto;

public class Exemplo03 {

	private static Set<Produto> produtoEmEstoque = new HashSet<Produto>();
	private static int numProdutos = 0;
	
	public static void adiciona(Produto p) {
		produtoEmEstoque.add(p);
		numProdutos++;
	}

	public static void remove(Produto p) {
		produtoEmEstoque.remove(p);
		numProdutos--;
	}
	
	public static void main(String[] args) {
		Produto arroz = new Produto("arroz");
		Produto feijao = new Produto("feijao");

		adiciona(arroz);
		adiciona(feijao);

		System.out.println("Tamanho da coleção: " + produtoEmEstoque.size());
		remove(feijao);
		System.out.println("Tamanho da coleção: " + produtoEmEstoque.size());
	}
}
