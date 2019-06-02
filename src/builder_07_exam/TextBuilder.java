package builder_07_exam;

public class TextBuilder implements Builder {
	
	private StringBuffer buffer = new StringBuffer();			
	
	public TextBuilder(String title) {
		// TODO Auto-generated constructor stub
		buffer.append("=================================\n");	
		buffer.append("<"+title+">");							
		buffer.append("\n");	
		
	}


	@Override
	public void makeString(String str) {						
		// TODO Auto-generated method stub				
		buffer.append("*"+str+"\n");							
		buffer.append("\n");									
		
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		for (int i = 0; i < items.length; i++) {
			buffer.append("-"+items[i]+"\n");
			buffer.append("\n");
			
		}
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		buffer.append("=================================\n");
		
		
	}

	public String getResult() {
		return buffer.toString();
	}


	
}
