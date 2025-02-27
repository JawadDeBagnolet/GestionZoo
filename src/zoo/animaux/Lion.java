package zoo.animaux;

public class Lion extends Animal{
    private String couleurPelage;

    public Lion(String nom, Integer age, String couleurPelage) {
        super(nom, age);
        this.couleurPelage = couleurPelage;
    }

    // attribut propre au lion
    public void rugissement(){
        System.out.println("Le lion "+ getNom() +" rugit !");
    }

    // getters , setters

    public String getCouleurPelage() {
        return couleurPelage;
    }

    public void setCouleurPelage(String couleurPelage) {
        this.couleurPelage = couleurPelage;
    }

}
