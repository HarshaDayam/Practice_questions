package Week1;

public class Denominations {

	public static void main(String[] args) {
		
		System.out.println( calculateDenominations(587));
		
	}
	
	public static String calculateDenominations(double amount){
		
			int _100 = (int) amount / 100;
			amount %= 100;
			int _50 = (int) amount / 50;
			amount %= 50;
			int _20 = (int) amount / 20;
			amount %= 20;
			int _10 = (int) amount / 10;
			amount %= 10;
			int _5 = (int) amount / 5;
			amount %= 5;
			int _1 = (int)amount;
			
			
			return " 100's : " +_100 +"\n 50's  : " +_50 +"\n 20's  : " +_20 +"\n 10's  : " +_10 +
					"\n 5's   : " +_5 +"\n 1's   : " +_1 ;  
			
					
	}
}

