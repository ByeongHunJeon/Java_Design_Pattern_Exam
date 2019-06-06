package bridge_09;

public class CountDisplay extends Display{
	
	public CountDisplay(DisplayImpl impl) {
		// TODO Auto-generated constructor stub
		super(impl);
	}
	
	public void multiDisplay(int times) {
		open();
		
		for (int i = 0; i < times; i++) {
			print();
		}
		
		close();
	}

}
