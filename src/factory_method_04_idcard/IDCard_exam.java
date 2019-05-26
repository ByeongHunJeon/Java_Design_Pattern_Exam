package factory_method_04_idcard;
import java.util.HashMap;
import java.util.UUID;

import factory_method_04_framework.*;

public class IDCard_exam extends Product_exam{
	
	private String owner;
	
	private HashMap<String, UUID> ownerList = new HashMap<String, UUID>();
	private UUID uid;
	
	IDCard_exam(String owner) {
		
		uid=UUID.randomUUID();
		
		ownerList.put(owner, uid);
		
		System.out.println(owner+"의 카드를 만듭니다. 인증번호 : "+uid);
		this.owner=owner;
		
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner+"의 카드를 사용합니다");
		
	}

	public String getOwner() {
		return owner;
	}

	@Override
	public UUID getCardID() {
		// TODO Auto-generated method stub
		return ownerList.get(owner);
	}
	

}
