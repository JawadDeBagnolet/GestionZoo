package zoo.animaux;

public class Oiseau extends Animal{
    private String couleurPlumage;
    private int poids;

    public Oiseau(String nom,Integer age, String couleurPlumage,int poids) {
        super(nom, age);
        this.couleurPlumage = couleurPlumage;
        this.poids = poids;
    }

    // attributs propres aux oiseaux :
    public void voler(){
        System.out.println("l'oiseau "+getNom()+" s'envole !");
    }

    public void afficherDetails() {
        System.out.println("Nom: " + getNom() + ", Âge: " + getAge() + " ans, Couleur: " + getCouleurPlumage() + ", Poids: " + getPoids() + " kg.");
    }


    public String getCouleurPlumage() {
        return couleurPlumage;
    }

    public void setCouleurPlumage(String couleurPlumage) {
        this.couleurPlumage = couleurPlumage;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

}
