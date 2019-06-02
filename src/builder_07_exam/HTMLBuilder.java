package builder_07_exam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder implements Builder {
	
	private String filename;
	private PrintWriter writer;
	
	public HTMLBuilder(String title) {
		// TODO Auto-generated constructor stub
		filename=title+".html";
		try {
			writer=new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		writer.println("<html><head><title>"+title+"</title></head><body>");
		writer.println("<h1>"+title+"</h1>");
	}


	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		writer.println("<p1>"+str+"</p1>");
		
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		writer.println("<ul>");
		
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>"+items[i]+"</li>");
			
			writer.println("</ul>");
		}
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		writer.println("</body></html>");
		writer.close();
		
	}
	
	public String getResult() {
		return filename;
	}

}
