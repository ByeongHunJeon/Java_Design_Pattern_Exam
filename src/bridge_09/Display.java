package bridge_09;

public class Display {
	
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		// TODO Auto-generated constructor stub
		this.impl=impl;
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
	

}
