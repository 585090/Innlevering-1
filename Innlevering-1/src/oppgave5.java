
import static javax.swing.JOptionPane.*;

public class oppgave5 {

	public static void main(String[] args) {

		
		int antelever = Integer.parseInt(showInputDialog("Hvor mange elever skal du registrere for? "));
		
		for (int i = 1; i <= antelever; i++) {
			
			int poeng = Integer.parseInt(showInputDialog("Hva ble din poengsum? "));
		
			System.out.println("Elev nummer "+i+": ");
				
			
		if (poeng > 100 || poeng < 0) {
			
			do {
				poeng = Integer.parseInt(showInputDialog("Poengsummen må være mellom 0 og 100!"));
			} while (poeng > 100 || poeng < 0);
		}
		
		if (poeng <= 100 && poeng >= 90) {
			
			System.out.println("Du fikk en A");
		}
		
		if (poeng < 90 && poeng >= 80) {
			
			System.out.println("Du fikk en B");
		}
			
		if (poeng < 80 && poeng >= 60) {
			
			System.out.println("Du fikk en C");
		}
		
		if (poeng < 60 && poeng >= 50) {
			
			System.out.println("Du fikk en D");
		}

		if (poeng < 50 && poeng >= 40) {
	
			System.out.println("Du fikk en E");
		}
		
		if (poeng < 40 && poeng >= 0) {
			
			System.out.println("Du fikk en F");
		}
		
		System.out.println();
		
		}
	}
}
