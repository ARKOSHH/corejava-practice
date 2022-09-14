/*
Program: Break and Continue
*/

class BreakContinue
{
  static void printNumbers()
  {
	  for(int i=1; i<=10 ;i++)
	  {
		  if(i==5)
		  {
			  break;
		  } 			  
		  System.out.println(i);
		  
	  }
  } 
    static void printNumbers2()
  {
	  for(int i=5; i<=10 ;i++)
	  {
		  if(i==5)
		  {
			  continue;
		  } 			  
		  System.out.println(i);
		  
	  }
  } 

  public static void main(String ... args)
  {
	  System.out.println("Printing numbers without 5");
	  printNumbers();
	  	  System.out.println("Printing numbers without 5");
	  printNumbers2();
  }
  
}