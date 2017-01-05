package Week1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LargestSumArray {

	public static void main(String[] args) {

		int[] a = { 1, 4, 6,2,8,1,9 };
		System.out.println("largest contiguous sum:" + largestContiguousSum(a));
		System.out.println("pairs of 10 : " + findingPairs(a)!=null?findingPairs(a):"No pairs found");
		System.out.println("pais of 10 overall: " + findPairs2(a)!=null?findPairs2(a):"No pairs found");
	}

	public static int largestContiguousSum(int a[]) {

		int max = 0;

		for (int i = 0; i < a.length; i++) {
			
			if(i+1 < a.length && max < a[i] + a[i+1] ){
				max = a[i] + a[i+1];
			}
			
		}

		return max;

	}
	
	public static StringBuilder findingPairs(int []a){
		StringBuilder pair = new StringBuilder();
		
		for (int i = 0; i < a.length; i++) {
			
			int x = 0;
			if(i+1 < a.length && x < a[i] + a[i+1] &&a[i] + a[i+1] == 10 ){				
				pair.append("{"+a[i]+","+ a[i+1]+"}");				
			}
			
		}
						
		return pair;
	}
	
	
	public static StringBuilder findPairs2(int[]a){
		
		StringBuilder pair = new StringBuilder();
		
		for(int i=0; i< a.length ; i++){
			
			for(int j=0;j<a.length;j++){
				
				if(a[i]+a[j] == 10){
					
					
					pair.append("{"+a[i]+","+ a[j]+"}");
				}
			}
			
		}
								
		return pair;			
	}

	public static int largestSum(int a[]){
		int max = 0;
		
		for(int i=0; i<a.length;i++ ){								
			
		}				
		return max;
	}
	
	public static void commonElements(int a[],int b[]){
		
		Set<Integer> array1 = new LinkedHashSet<Integer>();
		
		
		
		
		
		
		
	}
	
}
