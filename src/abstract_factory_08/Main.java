package abstract_factory_08;

import abstract_factory_08.factory.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length != 1) {
			
			System.out.println("Uesge : java Main class.name.of.ConcreteFactory");
			System.out.println("Example1 : java Main listfactory.ListFactory");
			System.out.println("Example2 : java Main tablefactory.TableFactory");
			System.exit(0);
			
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("�߾��Ϻ�", "http://www.joins.com/");
		Link chosun = factory.createLink("�����Ϻ�", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo!Korea!", "http://www.yahoo.co.kr/");
		Link excite = factory.createLink("Excite!", "http://www.excite.com/");
		Link google = factory.createLink("Yahoo!Korea!", "http://www.google.com/");
		
		Tray traynews = factory.createTray("�Ź�");
		traynews.add(chosun);
		traynews.add(joins);
		
		Tray trayyahoo = factory.createTray("yahoo");
		trayyahoo.add(kr_yahoo);
		trayyahoo.add(us_yahoo);
		
		Tray traysearch = factory.createTray("�˻�����");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "��������");
		page.add(traynews);
		page.add(traysearch);
		page.output();
		

	}

}
