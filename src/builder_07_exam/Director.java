package builder_07_exam;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
		
	}
	
	public void construct() {
		
		//builder.makeTile("Greeting");		// Ÿ��Ʋ
		builder.makeString("��ħ�� ����");		// ���ڿ�
		builder.makeItems(new String[] {	// ���� �׸�
				"���� ��ħ�Դϴ�.",
				"�ȳ��ϼ���",
		});
		
		builder.makeString("�㿡");			// ������ ���ڿ�
		builder.makeItems(new String[] {	// ������ ���� �׸�
				"�ȳ��ϼ���",
				"�ȳ��� �ֹ�����",
				"�ȳ��� �輼��",
		});
		
		builder.close();					// ������ �ϼ���Ų��.
	}



}
