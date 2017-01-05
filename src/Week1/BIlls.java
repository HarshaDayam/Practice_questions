package Week1;

public class BIlls {

	public static void main(String[] args) {
		
		System.out.println(calculateBill(60));
		System.out.println(calculateBill(100));
		System.out.println(calculateBill(250));
		System.out.println(calculateBill(260));
		System.out.println(calculateBill(560));
		System.out.println(calculateBill(600));
		
		
	}
	
	
	public static double calculateBill(double units){
		
		if(units<=100)
			return units*3.5;
		
		if(units > 100 && units <= 250)
			return (100 *3.5) + (units - 100) * 4;
		
		if(units > 250 && units <= 600)
			
			return (100 * 3.5) + (150 * 4) + (units - 350) * 4.5 ;
		
		
		
	return 0;
	}
}
