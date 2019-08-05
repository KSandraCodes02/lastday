package daySomething;

import java.util.Scanner;

public class LastDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner user = new Scanner (System.in);
			
		
		String first= "";
		String last= ""; 
		String email="";
		String postion= "";
		
		long number =0;
		
		System.out.println("CVS Job Application");
		
		System.out.println("What is your First name");
		first=user.next();
		System.out.println("What is your Last name");
		last=user.next();
		System.out.println("What is your phone number");
		number=user.nextLong();
		System.out.println("Available jobs are Stocker, Cashier, Manager");
		postion=user.next();
	
		if (postion.equalsIgnoreCase("Manager")) {
		
		System.out.println("As Manager you are responsible for ");
		System.out.println("planning the daily schedule and");
		System.out.println("interviewing future employers");}
		System.out.println("You have to be able to create and maintain budgets");
		System.out.println("maintain budgets and keep up with");
		System.out.println("employee hours");
		
		
		if (postion.equalsIgnoreCase("Stocker")) {
		System.out.println("As a Stocker you are responsible for");
		System.out.println("stocking nerchandise on shelves");
		System.out.println("and in storage. You will also be");
		System.out.println("obligated to guide the customers"); 
		System.out.println("through the store. Must be able to lift");
		System.out.println("least 40 pounds and be over 16 year of");
		System.out.println("age");}
		
		
		if (postion.equalsIgnoreCase("Cashier")) {
		System.out.println("As a Cashier your jobs is to ring up items");
		System.out.println("that are being pruchesed from our store ");
		System.out.println("and sometimes help lost customers find ");
		System.out.println("their way through the store");}
	}

}
