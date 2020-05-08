package Challenge;

import java.util.ArrayList;
import java.util.List;
import Helper.*;
public class chal1_mul3and5 {
	
	debug d = new debug();
	removeDup rm = new removeDup();
	
	public void exe(int _n) {
		int n = _n;
		d.debug("Dup", rm.rmDup(sumOfn(n)));
		d.debug("Sum", getSum(rm.rmDup((sumOfn(n)))));
	}
	
	public List<Integer> sumOfn(Integer base) {
		Integer x = 3;
		Integer y = 5;
		List<Integer> list_x = new ArrayList<Integer>();
		for(int i = 0; i < base; i++) {
			
			if(i % x == 0) {
				//debug("test", x);
				list_x.add(i);
			}
			
			if(i % y == 0) {
				list_x.add(i);
			}
		}
		return list_x;
	}
	
	public Integer getSum(List<Integer> list) {
			
			Integer n = 0;
			for(int i =0; i < list.size(); i++) {
				n += list.get(i);
			}
			
			return n;
			
	}
}
