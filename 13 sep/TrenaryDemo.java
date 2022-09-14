class TrenaryDemo
{
	static void ifElseEvenOdd(int num)
	{
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		
	}
	
	static void trenaryEvenOdd(int num)
	{
		String result= (num%2==0)? "Even number": "Odd number";
		System.out.println(result);
	}
	
	
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
      //ifElseEvenOdd(number);
      trenaryEvenOdd(number);	  
   }


}


