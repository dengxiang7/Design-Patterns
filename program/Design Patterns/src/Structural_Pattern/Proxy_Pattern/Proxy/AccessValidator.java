package Structural_Pattern.Proxy_Pattern.Proxy;

public class AccessValidator {

	
	public  boolean validator(String userid)
	{
		
		System.out.println("在数据库中进行验证");
	
		if(userid.equals("杨过"))
		{
			System.out.println("用户存在，登录成功！");
			return true;
		}
		else{
			System.out.println("用户不存在，登录失败！");
			return false;
		}
		
	}
	
}
