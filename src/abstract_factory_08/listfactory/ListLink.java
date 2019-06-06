package abstract_factory_08.listfactory;

import abstract_factory_08.factory.*;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}
	
	public String makeHTML() {
		return "  <li><a href=\""+url+"\">"+caption+"</a></li>\n";
	}
	

}
