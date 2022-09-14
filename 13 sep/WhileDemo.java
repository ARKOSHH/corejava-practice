class WhileDemo
{
	static void bulbStatus(int status)
	{
		
	    	while(status>=10)
	    	{
				
		    	System.out.println("Bulb is ON" + " ----Durability :"+status);
				status-=5;
					    	
		    }
			
			if(status<10)
			System.out.println("Bulb is OFF");
			
		
	}
	
	static void bulbStatusDo(int status)
	{
		
	    	do   
	    	{
				
		    	System.out.println("Bulb is ON" + " ----Durability :"+status);
				status-=5;
					    	
		    }while(status>=10);
			
			if(status<10)
			System.out.println("Bulb is OFF");
			
		
	}
	
	
	
		
   public static void main(String... args)
   {
	   int durability =Integer.parseInt(args[0]);
	 bulbStatusDo(durability); 
   }


}

