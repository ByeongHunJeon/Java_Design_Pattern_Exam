
public class Banner {

	private String string;
	public Banner(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
	}
	
	public void showWithParen() {
		System.out.println("("+string+")");
	}
	
	public void showWithAster() {
		System.out.println("*"+string+"*");
	}
	
}
