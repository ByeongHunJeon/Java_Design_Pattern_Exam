package factory_method_04_framework;

import factory_method_04_idcard.IDCard_exam;

public abstract class Factory_exam {
	
	public final Product_exam create(String owner) {
		IDCard_exam p = createProduct(owner);
		registerProduct(p);
		
		return p;
	}

	protected abstract IDCard_exam createProduct(String owner);
	protected abstract void registerProduct(Product_exam product);
	
}
