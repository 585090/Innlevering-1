
import static javax.swing.JOptionPane.*;

public class oppgave6 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Hvilket tall vil du fakultere? "));
		int faktorere = n;
		
		
		for (int i = n - 1; i > 1; i--) {
			
			faktorere = faktorere * i;
		}
		
		System.out.println(n+"! = "+faktorere);
	}

}
