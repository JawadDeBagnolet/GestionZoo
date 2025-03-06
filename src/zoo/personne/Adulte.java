package zoo.personne;

import zoo.animaux.*;

public class Adulte extends Personne {

    public Adulte(String nomPrenom, int age) {
        super(nomPrenom, age);
    }

    @Override
    public void reactSpectacle(Animal animal) {
        super.reactSpectacle(animal);
        System.out.println(getNomPrenom()+" se met à applaudir !");
    }
}
