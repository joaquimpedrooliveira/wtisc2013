package br.ufc.quixada.wtisc2013;

import java.util.HashSet;
import java.util.Set;

import equalsHashcode.Produto;

public class Exemplo03 {

	private static Set<Produto> produtoEmEstoque = new HashSet<Produto>();
	private static int numProdutos = 0;
	
	public static void adiciona(Produto p) {
		System.out.println("Adicionando o produto: " + p.getDescricao());
		produtoEmEstoque.add(p);
		System.out.println("Tamanho do estoque: " + produtoEmEstoque.size() + " itens.");
		numProdutos++;
	}

	public static void remove(Produto p) {
		System.out.println("Removendo o produto: " + p.getDescricao());
		produtoEmEstoque.remove(p);
		System.out.println("Tamanho do estoque: " + produtoEmEstoque.size() + " itens.");
		numProdutos--;
	}
	
	public static void main(String[] args) {
		Produto arroz = new Produto("arroz");
		Produto feijao = new Produto("feijao");

		adiciona(arroz);
		adiciona(feijao);

		remove(feijao);
	}
}
