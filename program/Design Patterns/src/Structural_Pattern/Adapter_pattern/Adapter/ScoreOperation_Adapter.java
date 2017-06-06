package Structural_Pattern.Adapter_pattern.Adapter;

import Structural_Pattern.Adapter_pattern.Adaptee.*;
import Structural_Pattern.Adapter_pattern.Target.ScoreOperation;

public class ScoreOperation_Adapter implements ScoreOperation {

	private BinarySearch bs=new BinarySearch();
	private QuickSort  qs=new QuickSort();
	
	@Override
	public int[] ScoreSort(int[] arr) {
		return qs.quickSort(arr)
				;
	}

	@Override
	public int ScoreSearch(int[] arr, int key) {
		return bs.bin_search(arr, key);
	}

}
