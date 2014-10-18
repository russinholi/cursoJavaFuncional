package din.jolim.strategy;

import java.util.ArrayList;
import java.util.List;

public class TesteSorter {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(3);
		lista.add(2);
		lista.add(14);
		
		Sorter sorter = criarSorter(args[0]);
		
		List<Integer> ordenada = sorter.sort(lista);
		for (Integer valor : ordenada){
			System.out.println(valor);
		}
			
	}

	private static Sorter criarSorter(String tipo) {
		if ("insertion".equals(tipo)) {
			new InsertionSorter();
		}
		return new SelectionSorter();
	}
	
	
}
