package factory_method_04;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import factory_method_04_framework.*;
import factory_method_04_idcard.*;

public class Main_exam {
	
	public static void main(String[] args) {
		
		Factory_exam factory = new IDCardFactory_exam();
		
		Product_exam card1 = factory.create("홍길동");
		Product_exam card2 = factory.create("이순신");
		Product_exam card3 = factory.create("강감찬");
		
		card1.use();
		card2.use();
		card3.use();
		
		UUID card1ID = card1.getCardID();
		
		System.out.println("card1ID : "+card1ID);
		
	}

}
