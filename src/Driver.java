import java.util.Scanner;

public class Driver {
	
	static Scanner s1 = new Scanner(System.in);
	public static void main(String[] args) {
			
		System.out.printf("your info will be printed twice for varification  ");
			//new object of driver class		
			Driver d1 = new Driver();		
			
			//uses driver object and calls read value method
			 System.out.printf("\nPerson 1 ");
			Person Stacey= d1.readValue();
	        Stacey.print();	        
	        
	        //uses driver object and calls read value method
	        System.out.printf("Person 2 ");
	        Person Ross= d1.readValue();
	        Ross.print();	        	        
	       	
	        //uses driver object and calls read value method
	        System.out.printf("Person 3 ");
	        Person Mia= d1.readValue();	       
	        Mia.print();
	        
	        s1.close();
	        System.exit(0);
	}
	//uses methods in Scanner to read values 
	// then creates "A Person" object with values and returns it.
	 public Person readValue() {		
		
		 	System.out.printf("what is your name?:");		 	
		 	String name= s1.nextLine();	         	
		 		 	
		 	System.out.printf("what is your age?:");
	        int age=s1.nextInt();
	        
	        //Clear the Input Buffer
	        s1.nextLine();
		 	
	        System.out.printf("what is your address?:");
	        String address=s1.nextLine();	       	       	        
	        
	        System.out.printf("what is your Phone Number?:");
	        String number=s1.nextLine();
	        
	       //wasnt sure if you wanted the program to use the overloaded constructor or just the setters and getters?
	        
	        //passes by reference calls the overload constructor of person class 
	        Person person = new Person(name,address,age,number);
	        
	        //sets the values  and prints the value given
	        person.setName(name);
	        person.setAddress(address);
	        person.setAge(age);
	        person.setPhoneno(number);
	        person.print();
	        
	        return person;
	        
	        
	    }
}
