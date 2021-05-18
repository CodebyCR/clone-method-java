
public class Privart_Computer implements Cloneable{

	private String model;
	private Cpu intel;
	
	
	public Privart_Computer (String model, int kerne, String model_Cpu) {
		this.model = model ;
		intel = new Cpu(kerne, model_Cpu);
		
	}

	public Privart_Computer Clone() throws CloneNotSupportedException{
//		return (Privart_Computer)super.clone();						//Alte Methode
		
		Privart_Computer hilf = (Privart_Computer)super.clone();	//Neue Methode
		hilf.intel = intel.clone();
		
		return hilf;
	}


	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Cpu getIntel() {
		return intel;
	}


	public void setIntel(Cpu intel) {
		this.intel = intel;
	}
	
	
}
