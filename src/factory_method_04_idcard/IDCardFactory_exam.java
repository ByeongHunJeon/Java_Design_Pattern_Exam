package factory_method_04_idcard;
import factory_method_04_framework.*;
import java.util.*;


public class IDCardFactory_exam extends Factory_exam {
	
	private List owners = new ArrayList();

	

	@Override
	protected IDCard_exam createProduct(String owner) {
		// TODO Auto-generated method stub
		
		
		IDCard_exam card = new IDCard_exam(owner);
		

		return card;
	}

	@Override
	protected void registerProduct(Product_exam product_exam) {
		// TODO Auto-generated method stub
		
		owners.add(((IDCard_exam)product_exam).getOwner());
	}
	
	public List getOwners() {
		return owners;
	}
	

}
