class Palindrome
{
	static void checkPalindrome(int number)
	{
		int remainder=0;
		int reversedNumber =0; // number used to store the reversed number
	    int temp =number;	// original number is stored in temp
		
		while(number>0)
		{
			remainder =number%10;
			reversedNumber= (reversedNumber*10)+remainder;
			number= number/10;
		}
		
		if(temp==reversedNumber)
		{
			System.out.println("The number is a palindrome");
			
		}
		else
			System.out.println("The number is not a palindrome");
		
	}
	
			
   public static void main(String... args)
   {
	 int num1= Integer.parseInt(args[0]);
	 checkPalindrome(num1);
	 
   }


}
