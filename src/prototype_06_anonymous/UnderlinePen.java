package prototype_06_anonymous;

import prototype_06_framework.Product;

public class UnderlinePen implements Product {
	
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		// TODO Auto-generated constructor stub
		this.ulchar=ulchar;
	}

	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		
		int length=s.getBytes().length;
		System.out.print("\""+s+"\"");
		System.out.println("");
		
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		
		System.out.println("");
		
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p =null;
		try {
			p=(Product)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
