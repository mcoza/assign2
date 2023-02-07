
public class Person {
   
	// instance variables of the Person Class
    private String name;
    private String address;
    private int age;
    private String phoneNo;
	
   	
	//write a default constructor
  
    public Person(){
    }
   
    //overloaded constructor  accepts input for  four variables.
    
    public Person(String name,String address,int age,String phoneno){
    	this.name=name;	
    	this.address = address;
    	this.age = age;
    	this.phoneNo = phoneno;
    }
    
   
//getter and setter methods.
    
    public String getName() {
  		return name;
  	}
  	public void setName(String name) {
  		this.name = name;
  	}
  	public String getAddress() {
  		return address;
  	}
  	public void setAddress(String address) {
  		this.address = address;
  	}
  	public int getAge() {
  		return age;
  	}
  	public void setAge(int age) {
  		this.age = age;
  	}
  	public String getPhoneno() {
  		return phoneNo;
  	}
  	public void setPhoneno(String phoneno) {
  		this.phoneNo = phoneno;
  	}

    //print() method that is given values by reference 
  	public void print() {
  		
  		System.out.printf("\nName:%s",this.name);
  		System.out.printf("\nAge:%d",this.age);
  		System.out.printf("\nAddress:%s",this.address);
  		System.out.printf("\nPhoneNumber:%s",this.phoneNo);
  		System.out.printf("\n\n");
  	}
  	
}
