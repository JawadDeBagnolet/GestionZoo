package zoo.animaux;

public class Animal {
    private String nom;
    private Integer age;

    public Animal(Animal animal) {
        this.nom= animal.getNom();
        this.age= animal.getAge();
    }

    public void seDeplacer(){
        System.out.println(getNom()+" se déplace.");
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
