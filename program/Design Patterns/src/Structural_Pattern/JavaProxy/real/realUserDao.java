package Structural_Pattern.JavaProxy.real;

import Structural_Pattern.JavaProxy.AbstractSubject.userDao;

public class realUserDao implements userDao {

	@Override
	public boolean FindUser(String userid) {

		if(userid.equals("张无忌"))
		{
			System.out.println("查询成功");
			return true;
		}else{
			System.out.println("查询失败");
			return false;
		}
		
		
	}

}
