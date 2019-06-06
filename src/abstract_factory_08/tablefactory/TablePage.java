package abstract_factory_08.tablefactory;

import abstract_factory_08.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}
	
	public String makeHTML() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<html><head><title>"+title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.
	}

}
