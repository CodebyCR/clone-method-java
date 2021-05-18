import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {

		Privart_Computer macBook = new Privart_Computer("MacBook", 8, "I7");
		
		Privart_Computer surfFace = macBook.Clone();
		
		surfFace.setModel("Surfface");
		surfFace.getIntel().setKerne(2);
		surfFace.getIntel().setModel("Dual Core");
		
		JOptionPane.showMessageDialog(null, macBook.getModel() + " enthält ein " + macBook.getIntel().getKerne() + "Kern " + macBook.getIntel().getModel());
		JOptionPane.showMessageDialog(null, surfFace.getModel() + " enthält ein " + surfFace.getIntel().getKerne() + "Kern " + surfFace.getIntel().getModel());
		
		//	Unterschied Tiefe Kopie:	Privart_Computer.java überarbeitete Clonemethode. Z.17 folgende
		//								Cpu.java einbundung von Cloneable-Interface & hinzufügen der Clonemethode. Z.2 & 13 folgende
	}

}
