import java.util.Scanner;

public class GenoNucleicAcid {
	static Scanner Input=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("First enter 5 different nucliec acids\n");
		GenoNucleicAcid GNA=new GenoNucleicAcid();
		
		NucleicAcid Cytosine=GNA.GNAInput();
		
		NucleicAcid Adenine=GNA.GNAInput();
		
		NucleicAcid Guanine=GNA.GNAInput();
		
		NucleicAcid Thymine=GNA.GNAInput();
		
		NucleicAcid Urcail=GNA.GNAInput();
		
		
		Cytosine.print();
		Adenine.print();
		Guanine.print();
		Thymine.print();
		Urcail.print();
		
	}

	
	public NucleicAcid GNAInput() {

		
	 	System.out.printf("Nucliec Acid Name?:");		 	
	 	String Name= Input.next();	         	
	 	
	 	Input.nextLine();
	 	
	 	System.out.printf("What is The Chemical Formula?:");
        String ChemForm=Input.nextLine();
   
        System.out.printf("What is the MolarMass?:");
        float Mass=Input.nextFloat();	       	       	        
        
        System.out.printf("What is the Denisty?:");
        float Density=Input.nextFloat();
        System.out.printf("\n");
		
        return new NucleicAcid(Name,ChemForm,Mass,Density);
		
	}
	
	
	
}

