package builder_07_exam;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
		
	}
	
	public void construct() {
		
		//builder.makeTile("Greeting");		// 타이틀
		builder.makeString("아침과 낮에");		// 문자열
		builder.makeItems(new String[] {	// 개별 항목
				"좋은 아침입니다.",
				"안녕하세요",
		});
		
		builder.makeString("밤에");			// 별도의 문자열
		builder.makeItems(new String[] {	// 별도의 개별 항목
				"안녕하세요",
				"안녕히 주무세요",
				"안녕히 계세요",
		});
		
		builder.close();					// 문서를 완성시킨다.
	}



}
