package Week1;

public class FizzBuzz {

	public static void main(String[] args) {
		
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzz();
		
	}
	
	public void fizzBuzz(){
		
		for(int i=1;i<=50;i++){
			
			if(i%3 == 0 && i%5 == 0 )
				System.out.println("FizzBuzz");
			else if(i%3 == 0)
				System.out.println("Fizz");
			else if(i%5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
		
		int i = (int) Math.sqrt(50);
		System.out.println("sqrt of 50 :" + i);
	}
}
