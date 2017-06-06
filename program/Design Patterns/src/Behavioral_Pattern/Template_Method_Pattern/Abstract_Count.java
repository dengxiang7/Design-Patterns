package Behavioral_Pattern.Template_Method_Pattern;

public abstract class Abstract_Count {

	// �������� -----���巽��
	public boolean validate(String userid) {
		System.out.println("�����û���֤��");
		return true;
	}

	// ���󷽷� ----��������ʵ��
	protected abstract void calculate();

	// �������� -----���巽��
	public boolean display() {
		System.out.println("��ʾ��Ϣ��");
		return true;
	}
	
	//ģ�巽��  -----�̶�����          -----ʵ�����㷨�Ŀ��
	public void template_calculate(String userid)
	{
		validate(userid);
		calculate();
		display();
	}
}
