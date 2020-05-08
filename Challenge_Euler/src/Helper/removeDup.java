package Helper;

import java.util.List;

public class removeDup {
	public List<Integer> rmDup(List<Integer> list) {
		List<Integer> lst = list;
		//Integer x = 0;
		for(int i =0; i < lst.size(); i++) {
			
			if(i+1 < list.size()) {
				if(lst.get(i) == lst.get(i+1)) {
					lst.remove(i);
				}
			}
			
		}
		return lst;
	}
}
