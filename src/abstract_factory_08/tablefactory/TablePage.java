package abstract_factory_08.tablefactory;

import java.util.Iterator;

import abstract_factory_08.factory.Item;
import abstract_factory_08.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}
	
	public String makeHTML() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<html><head><title>"+title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append("<tr>"+item.makeHTML()+"</tr>\n");
			
		}
		buffer.append("</table>\n");
		buffer.append("<tr><address>"+author+"</address>");
		buffer.append("</body></html>\n");
		
		return buffer.toString();
	}

}
