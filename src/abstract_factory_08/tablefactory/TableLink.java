package abstract_factory_08.tablefactory;

import abstract_factory_08.factory.*;

public class TableLink extends Link{

	public TableLink(String caption, String url) {
		super(caption, url);
	}
	
	public String makeHTML() {
		return "<td><a href=\""+url+"\">"+caption+"</a></td>\n";
	}
	

}
