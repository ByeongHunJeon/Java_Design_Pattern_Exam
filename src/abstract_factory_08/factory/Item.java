package abstract_factory_08.factory;

public abstract class Item {
	
	protected String caption;
	public Item(String caption) {
		// TODO Auto-generated constructor stub
		this.caption=caption;
	}
	
	public abstract String makeHTML();

}
