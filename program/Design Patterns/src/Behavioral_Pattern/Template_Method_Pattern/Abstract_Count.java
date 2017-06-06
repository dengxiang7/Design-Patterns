package Behavioral_Pattern.Template_Method_Pattern;

public abstract class Abstract_Count {

	// 基本方法 -----具体方法
	public boolean validate(String userid) {
		System.out.println("进行用户验证！");
		return true;
	}

	// 抽象方法 ----留待子类实现
	protected abstract void calculate();

	// 基本方法 -----具体方法
	public boolean display() {
		System.out.println("显示利息！");
		return true;
	}
	
	//模板方法  -----固定不变          -----实现了算法的框架
	public void template_calculate(String userid)
	{
		validate(userid);
		calculate();
		display();
	}
}
