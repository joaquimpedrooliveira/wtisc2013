package br.ufc.quixada.wtisc2013;
public class Exemplo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Long sum = 0L;
		long tempoInicial = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long tempoExecucao = System.currentTimeMillis() - tempoInicial;
		System.out.println("sum=" + sum);
		System.out.println("tempo execucao (ms)=" + tempoExecucao);

	}

}
