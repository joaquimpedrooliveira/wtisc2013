package br.ufc.quixada.wtisc2013;
import java.util.ArrayList;
import java.util.List;


public class Exemplo05 {

	private static void criaObjetosComConstrutor(List<Integer> lista) {
		for (int i=0; i < 2000000; i++) {
			lista.add(new Integer(1));
		}
	}
	
	private static void criaObjetosComValueOf(List<Integer> lista) {
		for (int i=0; i < 2000000; i++) {
			lista.add(Integer.valueOf(1));
		}
	}
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		System.out.println("Antes:" + memoriaUtilizada() + " bytes");
		long tempoInicial = System.currentTimeMillis();
		criaObjetosComConstrutor(lista);
		//criaObjetosComValueOf(lista);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Depois:" + memoriaUtilizada() + " bytes");
		System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " milissegundos.");

	}
	
	private static long memoriaUtilizada() {
		return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
	}
}
