public class Livre implements Empruntable {
    
    public String titre;
    public String auteur;
    public String isbn;
    public boolean disponible;

    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre a été emprunté.");
        } else {
            System.out.println("Le livre n'est pas disponible pour emprunt.");
        }
    }

    public void retourner() {
        disponible = true;
        System.out.println("Le livre a été retourné et est maintenant disponible.");
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void afficherDetails() {
        System.out.println("Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + isbn + ", Disponible: " + disponible);
    }

}

