
public class NucleicAcid {

	private String Name;
	private String ChemicalFormula;
	private float Molarmass;
	private float Density;
	
	public NucleicAcid(String Name, String ChemicalFormula, float Molarmass, float Density) {
		this.Name = Name;
		this.ChemicalFormula = ChemicalFormula;
		this.Molarmass = Molarmass;
		this.Density = Density;
		}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getChemicalFormula() {
		return ChemicalFormula;
	}
	public void setChemicalFormula(String ChemicalFormula) {
		this.ChemicalFormula = ChemicalFormula;
	}
	public float getMolarmass() {
		return Molarmass;
	}
	public void setMolarmass(float Molarmass) {
		this.Molarmass = Molarmass;
	}
	public float getDensity() {
		return Density;
	}
	public void setDensity(float Density) {
		this.Density = Density;
	}
	
	
	public void print() {
		System.out.printf("Name:%s\n", getName());
		System.out.printf("Chemical Formula:%s\n", getChemicalFormula());
		System.out.printf("Molar Mass: %.4f %s\n" , getMolarmass(),"g/mol");
		System.out.printf("Density:%.4f %s\n", getDensity(),"g/cm3");
		
	}
	
}
