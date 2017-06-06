package Structural_Pattern.Adapter_pattern.Adaptee;

public class BinarySearch {

	public int bin_search(int []n,int key)
	{
		
		int low=0,high=n.length-1,mid=0;
		
		mid=(low+high)/2;
		
		
		
		while(low<=high)
		{
			if(key<n[mid])
			{
				high=mid-1;
				mid=(low+high)/2;
			}
			
			if(key>n[mid])
			{
				low=mid+1;
				mid=(low+high)/2;
			}
			if(n[mid]==key)
			{
				return n[mid];
			}
		}
		
		
		return -1;
	}
	
	
}
