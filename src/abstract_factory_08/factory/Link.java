package abstract_factory_08.factory;

public abstract class Link extends Item {
	
	protected String url;
	public Link(String caption,String url) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.url=url;
	}

}
