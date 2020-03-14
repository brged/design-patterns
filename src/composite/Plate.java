package composite;

import java.util.ArrayList;

public class Plate extends MyEliment {

	private ArrayList list= new ArrayList();
	
	public void add(MyEliment eliment){
		list.add(eliment);
	}
	
	public void remove(MyEliment eliment){
		list.remove(eliment);
	}
	
	@Override
	public void eat() {
		for (Object object : list) {
			((MyEliment) object).eat();
		}
		
	}

}
