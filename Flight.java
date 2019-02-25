//Isha Sinha
//CSC 311
//Amlan Chatterjee
import java.text.DecimalFormat; //imports that call other classes
import java.util.Random;
import java.util.Scanner;

public class Flight {
	
	String name;
	int duration;
	long arrivalTime;
	long departureTime;
	int flightName;
	long price;
	String firstCity;
	String secondCity;
	
	
	public Flight() {
	String name="";
	int duration=0;
	long arrivalTime=0;
	long departureTime=0;
	long price=0;
	String firstCity="";
	String secondCity="";
	
	
	
	}

	public String getName() {
		
		return this.name;
	}

	public void setName(String name) { 
		this.name = name;
		
	}
	

	public int getDuration() {
		return duration;
	}

	public void setDuration() {
		
		this.duration =(int)((Math.random()*(75-45))+45);
	}
	//use for when user is adding only
	public void addDuration(int x){
	duration = x;
	}

	public long getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(long arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public long getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime() {
		
		this.departureTime = (long)((Math.random()*(22-6))+6);
	}
	//use only for when user is adding 
	public void addDepartureTime(long x){
		departureTime = x;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = (int)((Math.random()*(250-50))+50);
	}
	
	//when you add a new airline price
	public void addPrice(long x)
	{
		price = x;
	}
	
	
	public void setFirstCity(String city)			//setting departure city
	{
		firstCity = city;
	}
	public void setSecondCity(String city)			//setting arrival city
	{
		secondCity = city;
	}
	public String getFirstCity()
	{
		return firstCity;
	}
	public String getSecondCity()
	{
		return secondCity;
	}
	
	
	
	
	
	public String toStringMethod(){
		 String s = "Flight from: " + firstCity + " to " + secondCity + " Flight Name: " + name + " | Flight Duration: " + duration +  "   minutes    | Departure Time: " + departureTime + " :00 | Arrival Time: "+arrivalTime+ " :00  | Price: $"+price ;
		return s;
	}
	
	public long getArrivalTime(int duration,long departureTime){
		return this.arrivalTime=(duration+departureTime);
	}

}
