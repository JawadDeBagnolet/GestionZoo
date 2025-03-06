package zoo.personne;

import zoo.animaux.Animal;

public class Enfant extends Personne {
    private double prixEntree;

    public Enfant(String nomPrenom, int age) {
        super(nomPrenom, age);
        if (age >= 16) {
            System.out.println("Un enfant doit avoir moins de 16 ans.");
        }
    }

    @Override
    public void reactSpectacle(Animal animal) {
        super.reactSpectacle(animal);
        System.out.println(getNomPrenom()+" se met à applaudir !");
    }
}
