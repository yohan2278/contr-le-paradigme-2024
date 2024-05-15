import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Personne> personnes = new ArrayList<>();

		personnes.add(new Membre("Antoine", "Engasser", 101, new Date(), "Actif"));
		personnes.add(new Employe("Hugo", "DeMarco", 102, "Chercheur", 55000.0));
		personnes.add(new Membre("Swann", "Cape", 103, new Date(), "Inactif"));
		personnes.add(new Employe("Yohan", "Halimi", 104, "Responsable RH", 70000.0));

		Livre livre1 = new Livre("1984", "George Orwell", "1234567890", true);
		Livre livre2 = new Livre("2012", "JK Rowlling", "123467867788", true);

		for (Personne personne : personnes) {
			personne.afficherDetails();

		}
	}

//    
//		Personne personne1 = personnes.get(0);
//
//        if (personne1 instanceof Membre)
//        {
//			personne1.emprunter(livre1);
//		}
//        personnes.emprunter(livre2);
//
//        System.out.println("\nAprès emprunt:");
//        livre1.getDisponible(); 
//        livre2.getDisponible();
//        
//        
//        personnes.retourner(livre1);
//
//        System.out.println("\nAprès retour:");
//        livre1.getDisponible();
}
