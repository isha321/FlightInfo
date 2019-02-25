//Isha Sinha
//CSC 311
//Amlan Chatterjee
import java.util.Scanner;
 class csc311p1 {
	 
	 	public static String first;
		public static String second;
	
	public static void main  (String [] args)  {
		
			
			Scanner input = new Scanner(System.in);
			
			Flight [] f = new Flight[20];
			populateFlights(f);
			menu(f);
		}
	public static Flight [] addFlight(Flight[] f){
		
		Flight n= new Flight();
		Scanner keyboard = new Scanner(System.in);
		Flight [] newArray = new Flight[f.length+1];
		for(int i=0 ;i<f.length; i++) //[0, 20)
		{
			newArray[i] = f[i];
		}
		
		//index [0, 20]
		System.out.println("Enter flight name");
		String name= keyboard.nextLine();
		n.setName(name);
		System.out.println("Enter duration time");
		int duration = keyboard.nextInt();
		n.addDuration(duration);
		System.out.println("Enter Departure time");
		long departure = keyboard.nextLong();
		n.addDepartureTime(departure);
		n.setArrivalTime(departure + duration);
		System.out.println("Enter the price");
		long price = keyboard.nextLong();
		n.addPrice(price);
		
		n.setFirstCity(first);
		n.setSecondCity(second);
		
		newArray[f.length] = n;
		
	return newArray;
		
	}
	
	
		public static void populateFlights(Flight [] f){
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter departure city");
			first = keyboard.nextLine();
			System.out.println("Enter arrival city");
			second = keyboard.nextLine();
			
			for(int i=0;i<f.length;i++){
				f[i] = new Flight();
				f[i].setName("Airline"+(i+1));
				f[i].setDuration();
				f[i].setDepartureTime();
				f[i].setArrivalTime(f[i].getDepartureTime() + f[i].getDuration());
				f[i].setPrice();
				f[i].setFirstCity(first);
				f[i].setSecondCity(second);
			}
			
			for(int i=0;i<f.length;i++){
				f[i].toStringMethod();
			}
			
		}
		/*

	The sorting methods will sort the flights objects using
	bubble sort which will take one number and compare 
	the number to the number in the next index. The 
	smaller number will then be swapped if less
							*/



		public static void sortingDuration(Flight [] f)				//Reference: https://www.javatpoint.com/bubble-sort-in-java
		{
			Flight temp=null;
			for(int i=0; i<f.length; i++)
			{
				for(int j=1; j< (f.length-i); j++)
				{
					if(f[j-1].getDuration() > f[j].getDuration())
					{
						temp = f[j-1];
						f[j-1] = f[j];
						f[j] = temp;
					}
				}
			}
			for(int i=0;i<f.length;i++){
				System.out.println(f[i].toStringMethod());
			}
			
			
		}
		public static void sortingPrice(Flight [] f)						//Reference: https://www.javatpoint.com/bubble-sort-in-java
		{
			Flight temp=null;
			for(int i=0; i<f.length; i++)
			{
				for(int j=1; j< (f.length-i); j++)
				{
					if(f[j-1].getPrice() > f[j].getPrice())
					{
						temp = f[j-1];
						f[j-1] = f[j];
						f[j] = temp;
					}
				}
			}
			for(int i=0;i<f.length;i++){
				System.out.println(f[i].toStringMethod());
			}
			
			
		}
		public static void sortingArrivalTime(Flight [] f)					//Reference: https://www.javatpoint.com/bubble-sort-in-java
		{
			Flight temp=null;
			for(int i=0; i<f.length; i++)
			{
				for(int j=1; j< (f.length-i); j++)
				{
					if(f[j-1].getArrivalTime() > f[j].getArrivalTime())
					{
						temp = f[j-1];
						f[j-1] = f[j];
						f[j] = temp;
					}
				}
			}
			for(int i=0;i<f.length;i++){
				System.out.println(f[i].toStringMethod());
			}
			
			
		}
		
		public static void sortingDepartureTime(Flight [] f)				//Reference: https://www.javatpoint.com/bubble-sort-in-java
		{
			Flight temp=null;
			for(int i=0; i<f.length; i++)
			{
				for(int j=1; j< (f.length-i); j++)
				{
					if(f[j-1].getDepartureTime() > f[j].getDepartureTime())
					{
						temp = f[j-1];
						f[j-1] = f[j];
						f[j] = temp;
					}
				}
			}
			for(int i=0;i<f.length;i++){
				System.out.println(f[i].toStringMethod());
			}
			
			
		}
		
		public static void searchTicket(Flight[] f, String name){
			
			int counter=0;
		for(int i=0; i<f.length;i++){
			if(f[i].getName().equals(name))
			{
				System.out.println(f[i].toStringMethod());
				counter++;
				
			}
		}
		if(counter==0)
		{
			System.out.println("Flight doesnt exist!");
		}
		}
		
		
		 public static void menu(Flight [] f) { // main menu 
        
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("-------------------------------------"); 
			System.out.println("Hello!");
			System.out.println("[1 List all the flights between 2 given cities]");
			System.out.println("[2] Display the flights sorted according to flight duration");
			System.out.println("[3] Display the flights according to departure time");
			System.out.println("[4]  Display the flights according to arrival time");
			System.out.println("[5]Display the flights according to ticket price");
			System.out.println("[6]Search for a ticket using a specific airline");
			System.out.println("[7] Add a flight ");
			System.out.println("[8] Exit ");
			System.out.println("-------------------------------------");
			System.out.println("Please select an option: ");
			int option = input.nextInt();
			
			while(option !=8)
			{
			if(option ==1)
			{
				System.out.println("~~~~~~~~~~~Flights~~~~~~~~~");
				for(int i=0;i<f.length;i++){
				System.out.println(f[i].toStringMethod());
				}
				System.out.println();
			}
			else if(option==2)
			{
				System.out.println("Sorting by duration time");
				sortingDuration(f);
				System.out.println();
			}
			else if(option==3)
			{
				System.out.println("Sorting by departure time");
				sortingDepartureTime(f);
				System.out.println();
			}
			else if(option==4)
			{
				System.out.println("Sorting by arrival time");
				sortingArrivalTime(f);
				System.out.println();
			}
			else if(option==5)
			{
				System.out.println("Sorting by price");
				 sortingPrice(f);
				 System.out.println();
			}
			else if(option==6)
			{
				System.out.println("Enter a flight name");
				String flightName=input.next();
				searchTicket(f, flightName);
				System.out.println();
			}
			else if(option == 7)
			{
				if(f.length ==25)
				{
					System.out.println("Unable to add anymore flights");
				}
				else{
					System.out.println("Add a flight");
					f = addFlight(f);
					System.out.println();
					for(int i=0;i<f.length;i++){
					System.out.println(f[i].toStringMethod());
					}
				}
			}
			else if(option ==8)
			{
				System.out.println("Come back again soon!");
				System.exit(0);
			}
			
																										//to make sure it will ask for menu after adding flight
			System.out.println("-------------------------------------"); 
			System.out.println("Hello!");
			System.out.println("[1 List all the flights between 2 given cities]");
			System.out.println("[2] Display the flights sorted according to flight duration");
			System.out.println("[3] Display the flights according to departure time");
			System.out.println("[4]  Display the flights according to arrival time");
			System.out.println("[5]Display the flights according to ticket price");
			System.out.println("[6]Search for a ticket using a specific airline");
			System.out.println("[7] Add a flight ");
			System.out.println("[8] Exit ");
			System.out.println("-------------------------------------");
					System.out.println("Please select an option: ");
			option = input.nextInt();
			
			
			
			}
			
		}
 }