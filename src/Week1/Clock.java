package Week1;

public class Clock {
	
	public static void main(String[] args) {
		
		int h = 9,m = 15;
		System.out.println(findAngle(h,m));
		
	}
	
	public static String findAngle(int h, int m){
	
		int angle = (h*30 + m/2) - (m*6);
		
		return Math.abs(angle) + " other angle " + Math.abs(360-angle);
		
	}

}
