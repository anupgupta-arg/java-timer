class Time
	{ Thread th;
	  int sec,min=0;
	  int hr=0;
		public static void main(String ag[])
		{ Time ob= new Time();
		}
		public Time()
		{
		while(hr<24)
		{ 
	   	for(min=0;min<60;min++)
		{
		for(sec=1;sec<=60;sec++)
		{
		try
	
		{ if(hr<10)
		System.out.print("0"+hr+":");
		else
		System.out.print(hr+":");
		 

		if(min<10)
		System.out.print("0"+min+":");
		else
		System.out.print(min+":");
		
		if(sec<10)
		System.out.print("0"+sec);
		else
		System.out.print(sec);

		System.out.print("\r");
		th.sleep(1000);
		} 
		catch(Exception ex)
		{}
		
		
	    }
		} hr++;
		}
		}

	}