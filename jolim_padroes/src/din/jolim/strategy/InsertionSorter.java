package din.jolim.strategy;

import java.util.ArrayList;
import java.util.List;

public class InsertionSorter implements Sorter {

	@Override
	public <T extends Comparable<? super T>> List<T> sort(List<T> list) {
		list = new ArrayList<T>(list);
		for (int i = 1; i < list.size(); i++) {
			T aux = list.get(i);
			for (int j = i - 1; i >= 0 
					&& list.get(j).compareTo(aux) >0; j--) {
				list.remove(j+1);
				list.add(j+1, list.get(j));
				list.remove(j);
				list.add(j,aux);				
			}			
		}
		return list;
	}

}
