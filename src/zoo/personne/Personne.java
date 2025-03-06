package zoo.personne;

import zoo.animaux.*;

public class Personne {
    private String nomPrenom;
    private int age;
    private double prixEntree;

    public Personne(String nomPrenom, int age) {
        this.nomPrenom = nomPrenom;
        this.age = age;
    }
    public String toString() {
        return "Personne{" +
                " nom : " + nomPrenom +
                " age : " + age +
                '}';
    }
    public void reactSpectacle(Animal animal) {
        System.out.println("Wah ! c'est un magnifique "+animal+" !");
        System.out.println(getNomPrenom()+ " semble émerveillé à la vue du spectacle.");
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrixEntree() {
        return prixEntree;
    }

    public void setPrixEntree(double prixEntree) {
        this.prixEntree = prixEntree;
    }
}
