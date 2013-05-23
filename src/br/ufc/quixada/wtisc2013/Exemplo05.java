package br.ufc.quixada.wtisc2013;
import java.util.ArrayList;
import java.util.List;

public class Exemplo05 {

	public static void main(String a[]) {
		String texto = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		List<String> variasLinhas = new ArrayList<String>();
		System.out.println("Antes:" + memoriaUtilizada() + " bytes");
		long tempoInicial = System.currentTimeMillis();
		for (int i=0;  i<2000000; i++) {
			variasLinhas.add(new String("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
			//variasLinhas.add("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Depois:" + memoriaUtilizada() + " bytes");
		System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " segundos.");
 	}

	private static long memoriaUtilizada() {
		return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
	}

}
