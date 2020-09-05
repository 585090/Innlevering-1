
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;


public class oppgave3 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(showInputDialog("Velg en verdi for x: "));
		int n = Integer.parseInt(showInputDialog("Velg en verdi for n"));
	
		double svar = pow(x, n);
		
		System.out.println(x+"^"+n+" = "+svar);
		System.out.println();
		
		
		int tall = x;
		int resultat = 1;
		
		while (n > resultat) {
			tall = tall*x;
			resultat++;
		}
		
		System.out.println("Svaret med while-setning: "+tall);
		
	}

}
