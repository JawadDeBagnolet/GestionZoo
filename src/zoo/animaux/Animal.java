package zoo.animaux;

public class Animal {
    private String nom;
    private Integer age;

    public Animal(String nom, Integer age) {
        this.nom= nom;
        this.age= age;
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

}
