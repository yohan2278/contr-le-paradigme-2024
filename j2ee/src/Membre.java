import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Membre extends Personne {
    private Date dateAdhesion;
    private String statut;
    private List<Livre> emprunts = new ArrayList<>();


    public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
        super(nom, prenom, id);
        this.dateAdhesion = dateAdhesion;
        this.statut = statut;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    public void emprunter(Livre livre) {
        if (livre.getDisponible()) {
            livre.setDisponible(false);
            emprunts.add(livre);
            System.out.println("Le livre " + livre.getTitre() + " a été emprunté par " + getPrenom() + " " + getNom());
        } else {
            System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour l'emprunt.");
        }
    }

    public void retourner(Livre livre) {
        if (emprunts.remove(livre)) {
            livre.setDisponible(true);
            System.out.println("Le livre " + livre.getTitre() + " a été retourné par " + getPrenom() + " " + getNom());
        } else {
            System.out.println("Le livre " + livre.getTitre() + " n'était pas emprunté par " + getPrenom() + " " + getNom());
        }
    }

    public void afficherDetails() {
        System.out.println("Nom: " + getNom() + ", Prénom: " + getPrenom() + ", ID: " + getId() +
                           ", Date d'adhésion: " + dateAdhesion + ", Statut: " + statut);
    }
    
}




