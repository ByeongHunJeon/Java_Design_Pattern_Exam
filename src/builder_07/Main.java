package builder_07;

public class Main {
	
	public static void main(String[] args) {
		
		
		if (args.length != 1) {
			usege();
			System.exit(0);
			
		}
		
		if (args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result=textbuilder.getResult();
			System.out.println(result);
			
		}else if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String result=htmlbuilder.getResult();
			System.out.println(result);
			
		}else {
			usege();
			System.exit(0);
		}
		
	}
		
		public static void usege() {
			System.out.println("Usege: java Main plain �Ϲ� �ؽ�Ʈ�� �����ۼ�.");
			System.out.println("Usege: java Main html HTML ���Ϸ� �����ۼ�.");
		}
		

}
