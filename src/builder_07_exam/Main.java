package builder_07_exam;

public class Main {
	
	public static void main(String[] args) {
		
		
		if (args.length != 1) {
			usege();
			System.exit(0);
			
		}
		
		String title="Greeting";
		
		if (args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder(title);
			Director director = new Director(textbuilder);
			director.construct();
			String result=textbuilder.getResult();
			System.out.println(result);
			
		}else if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder(title);
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
			System.out.println("Usege: java Main plain 일반 텍스트로 문서작성.");
			System.out.println("Usege: java Main html HTML 파일로 문서작성.");
		}
		

}
