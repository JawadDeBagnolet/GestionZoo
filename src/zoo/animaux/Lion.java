package zoo.animaux;

public class Lion extends Animal{
    private String couleurPelage;
    private int poids;
    private String etat;

    public Lion(String nom, Integer age, String couleurPelage, int poids, String etat) {
        super(nom, age);
        this.couleurPelage = couleurPelage;
        this.poids = poids;
    }

    // attribut propre au lion
    public void rugissement(){
        System.out.println("Le lion "+ getNom() +" rugit !");
    }

    public void afficherDetails() {
        System.out.println("Nom: '" + getNom() + "', Âge: " + getAge() + " ans, Couleur: " + getCouleurPelage() + ", Poids: " + getPoids() + " kg.");
    }


    // getters , setters

    public String getCouleurPelage() {
        return couleurPelage;
    }

    public void setCouleurPelage(String couleurPelage) {
        this.couleurPelage = couleurPelage;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
