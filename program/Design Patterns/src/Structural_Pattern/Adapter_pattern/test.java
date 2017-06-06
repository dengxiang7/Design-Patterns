package Structural_Pattern.Adapter_pattern;

import Structural_Pattern.Adapter_pattern.Adapter.ScoreOperation_Adapter;
import Structural_Pattern.Adapter_pattern.Target.ScoreOperation;

public class test {

	
	public static void main(String[] args) {
		ScoreOperation so=new ScoreOperation_Adapter();
		
		int score[]={33,56,24,79,100};
		int result[];
		int TargetScore;
		
		result=so.ScoreSort(score);
		System.out.println("排序后成绩：");
		for(int i:result)
		{
			System.out.print("  "+i);
		}
		System.out.println();
		System.out.println("查找成绩79:");
		TargetScore=so.ScoreSearch(result, 79);
		if(TargetScore!=-1)
		{
			System.out.println("找到成绩为："+TargetScore);
		}else
		{
			System.out.println("未找到");
		}
	}
	
	
	
	
	
}
