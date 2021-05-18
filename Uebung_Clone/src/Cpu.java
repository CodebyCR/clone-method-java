
public class Cpu implements Cloneable{

	private int kerne;
	private String model_Cpu;
	
	
	public Cpu(int kerne, String model_Cpu) {
		this.kerne = kerne;
		this.model_Cpu = model_Cpu;
	}

	public Cpu clone() throws CloneNotSupportedException{
		return (Cpu)super.clone();
	}
	
	public int getKerne() {
		return kerne;
	}

	public void setKerne(int kerne) {
		this.kerne = kerne;
	}

	public String getModel() {
		return model_Cpu;
	}

	public void setModel(String model_Cpu) {
		this.model_Cpu = model_Cpu;
	}
	
	
}
