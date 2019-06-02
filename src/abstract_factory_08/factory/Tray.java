package abstract_factory_08.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
	
	protected ArrayList tray = new ArrayList();
	
	public Tray(String caption) {
		// TODO Auto-generated constructor stub
		super(caption);
	}
	
	public void add(Item item) {
		tray.add(item);
	}


}
