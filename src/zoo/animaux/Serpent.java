package zoo.animaux;

public class Serpent extends Animal {
    private String couleurEcailles;

    public Serpent(String nom, Integer age, String couleurEcailles) {
        super(nom, age);
        this.couleurEcailles = couleurEcailles;
    }
    // attributs propres aux serpents
    public void seCamoufler(){
        System.out.println("le serpent "+getNom()+" se camoufle sous le sable");
    }

    public String getCouleurEcailles() {
        return couleurEcailles;
    }

    public void setCouleurEcailles(String couleurEcailles) {
        this.couleurEcailles = couleurEcailles;
    }
}
