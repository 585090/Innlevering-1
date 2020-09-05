
import static javax.swing.JOptionPane.*;

public class oppgave2 {

	
	public static void main(String[] args) {
		
		int nedre = Integer.parseInt(showInputDialog("Velg en nedre grense: "));
		int ovre = Integer.parseInt(showInputDialog("Velg en øvre grense"));
	
		System.out.println("Nedre grense: "+nedre);
		System.out.println("Øvre grense: "+ovre);
		
		if (nedre%2 == 0) {
			
			nedre = nedre+1;
			
			for (int i = nedre; i <= ovre; i+=2) {
			System.out.print(i+" ");
			}
		}
		else {
		
			for (int i = nedre; i <= ovre; i+=2) {
			System.out.print(i+" ");
		}
		}
	}
}