package zoo.animaux;

public class Serpent extends Animal {
    private String couleurEcailles;
    private int poids;

    public Serpent(String nom, Integer age, String couleurEcailles,int poids) {
        super(nom, age);
        this.couleurEcailles = couleurEcailles;
        this.poids = poids;
    }

    // attributs propres aux serpents
    public void seCamoufler(){
        System.out.println("le serpent "+getNom()+" se camoufle sous le sable");
    }

    public void afficherDetails() {
        System.out.println("Nom: " + getNom() + ", Âge: " + getAge() + " ans, Couleur: " + getCouleurEcailles() + ", Poids: " + getPoids() + " kg.");
    }

    public String getCouleurEcailles() {
        return couleurEcailles;
    }

    public void setCouleurEcailles(String couleurEcailles) {
        this.couleurEcailles = couleurEcailles;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
