package bridge_09;

public class StringDisplayImpl extends DisplayImpl{
	
	private String string;
	private int width;
	
	public StringDisplayImpl(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
		this.width=string.getBytes().length;
	}
	
	public void rawOpen() {
		printLine();
	}
	
	public void rawPrint() {
		System.out.println("|"+string+"|");
	}
	
	public void rawClose() {
		printLine();
	}
	
	public void printLine() {
		System.out.print("+");
		
		for (int i = 0; i < width; i++) {
			System.out.print("-");
			
		}
		System.out.println("+");
	}

}
