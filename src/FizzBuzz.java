
public class FizzBuzz {

	public static void main(String[] args)
	{
		
		for(int i = 0; i<100; i++)
		{
			boolean divByThree = ((i%3)==0);
			boolean divByFive = ((i%5)==0);
			System.out.println(i);
			
			if(divByThree && divByFive)
				System.out.println("fizzbuzz");
			
			
			else if(divByThree)
				System.out.println("fizz");
			else if(divByFive)
				System.out.println("buzz");
			
			
		}
		
	}
	
	
	
}
