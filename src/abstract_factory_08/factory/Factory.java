package abstract_factory_08.factory;

public abstract class Factory {

	
	public static Factory getFactory(String classname) {
		
		Factory factory = null;
		
		try {
			factory = (Factory) Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스 "+classname+" 이 발견되지 않았습니다.");
		}
		
		return factory;

	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	
}
