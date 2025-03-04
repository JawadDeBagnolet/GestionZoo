package zoo.animaux;

public class Animal {
    private String nom;
    private Integer age;
    private boolean malade;

    public Animal(String nom, Integer age) {
        this.nom= nom;
        this.age= age;
        this.malade = false;
    }

    public String toString() {
        return "Animal{" +
                " nom : " + nom +
                " age : " + age +
                '}';
    }

    public void seDeplacer(){
        System.out.println(getNom()+" se déplace.");
    }

    public void manger(){
        System.out.println(getNom()+" mange.");
    }

    public void faireDuBruit() {
        System.out.println(getNom() + " fait du bruit.");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void isMalade() {
        this.malade = true;
    }

    public void setMalade(boolean malade) {
        this.malade = malade;
    }
}
