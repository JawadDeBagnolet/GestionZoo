package zoo.animaux;

public class Oiseau extends Animal{
    private String couleurPlumage;

    public Oiseau(String nom,Integer age, String couleurPlumage) {
        super(nom, age);
        this.couleurPlumage = couleurPlumage;
    }

    // attributs propres aux oiseaux :
    public void voler(){
        System.out.println("l'oiseau "+getNom()+" s'envole !");
    }

    public String getCouleurPlumage() {
        return couleurPlumage;
    }

    public void setCouleurPlumage(String couleurPlumage) {
        this.couleurPlumage = couleurPlumage;
    }
}
