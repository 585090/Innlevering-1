
public class oppgave1 {

	public static void main(String[] args) {
		
		// skriver ut en tekst med 10 linjer "dette er linje nr.n" men har mellomrom mellom linje 4-5 og 8-9
		
			    int i;

			    System.out.println("Test av repetisjonssetning.");
			    System.out.println("***************************");

			    i = 1;

			    while (i <= 10) {
			      System.out.println("Dette er linje nr. " + i);

			      if (i == 4) {
			        System.out.println();
			      }

			      if (i == 8) {
			        System.out.println();
			      }

			      i = i + 1;
		}	  
	}
}


