package br.ufc.quixada.wtisc2013;

import java.io.IOException;

import excecoes.ApresentacaoException;
import excecoes.JPAException;
import excecoes.NegocioException;

public class Exemplo11 {

	public static void main(String[] args) {
		Exemplo11 meuPrograma = new Exemplo11();
		try {
			meuPrograma.jsf();
		} catch (ApresentacaoException e) {
			// TODO Auto-generated catch block
		}
	}
	
	private void jsf() throws ApresentacaoException {
		try {
			negocio();
			System.out.println("WTISC 2013");
		} catch (NegocioException e) {
			throw new ApresentacaoException("Erro ao tentar fazer a funcionalidade!");
		}
	}

	private void negocio() throws NegocioException {
		try {
			jpa();
		} catch (JPAException e) {
			throw new NegocioException("Erro no negócio.");
		}
	}
	
	private void jpa() throws JPAException {
		try {
			this.hibernate("TB_UFC");
		} catch (IOException e) {
			throw new JPAException("Erro no JPA.");
		}
	}
	
	private void hibernate(String tabela) throws IOException {
		throw new IOException ("Tabela não existe!");
	}
	

}
