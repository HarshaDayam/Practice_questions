package Week1;

public class IntegerArrayMax2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		System.out.println(secondHighestNum(a));
		
		
	}
	
	public static int secondHighestNum(int []a){
		
		
		int max2 = 0,max =0;
		
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max2 = max;
				max = a[i]; 
			}
						
		}		
		
		return max2;
	}
}
