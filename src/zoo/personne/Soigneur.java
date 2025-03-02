package zoo.personne;

import zoo.animaux.Animal;
import zoo.animaux.Lion;

public class Soigneur extends Personne {
    private String specialite;

    public Soigneur(String nomPrenom, int age, String specialite) {
        super(nomPrenom, age);
        this.specialite = specialite;
    }

    public void diagnostic() {
        int aleatoire = (int) (Math.random() * 2);  // Renvoie soit 0 soit 1
        System.out.println("Valeur aléatoire (0 ou 1) : " + aleatoire);

        System.out.println("Le Soigneur"+getNomPrenom()+" diagnostique un "+getSpecialite() +" :");
        if (aleatoire == 0) {
            System.out.println("L'animal " + getSpecialite() +" diagnostiqué est en bonne santé !");
        }
        else if (aleatoire == 1) {
            System.out.println("L'animal " + getSpecialite() +" diagnostiqué est malade !");
        }
    }

    public void soigner(){
        if (getEtat() == 1){
            System.out.println("le soigneur "+getNomPrenom()+" vient soigner l'animal "+getSpecialite());
        } else if (getEtat() == 0) {
            System.out.println("Nul besoin de soigner un animal en bonne santé !");
        }
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
