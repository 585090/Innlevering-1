
import static javax.swing.JOptionPane.*;

public class oppgave4 {

	public static void main(String[] args) {
		
		int bruttolonn = Integer.parseInt(showInputDialog("Hva er din bruttolønn: "));
		
		System.out.println("Bruttolønn: "+bruttolonn);
		System.out.println();
		
		if (bruttolonn < 164000) {
			
			System.out.print("Du tjener ikke nok for trinnskatt");
		}
		
		else if (bruttolonn > 164000 && bruttolonn <= 230950){
			
			System.out.print("Du skatter: "+bruttolonn*0.0093);
		}
		
		else if (bruttolonn > 230950 && bruttolonn <= 580650) {
			
			System.out.print("Du skatter: "+bruttolonn*0.0241);
		}
		else if (bruttolonn > 580650 && bruttolonn <= 934050) {
			
			System.out.print("Du skatter: "+bruttolonn*0.1152);
		}
		
		else if (bruttolonn > 934050) {
			
			System.out.print("Du skatter: "+bruttolonn*0.1452);
		}
	}
}
