package template_method_03;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractDisplay d1=new CharDisplay('H');
		AbstractDisplay d2=new StringDisplay("Hello World");
		AbstractDisplay d3=new StringDisplay("안녕하세요.");
		
		d1.display();
		d2.display();
		d3.display();
		
	}

}
