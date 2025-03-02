package appli;
import zoo.animaux.*;
import zoo.personne.Soigneur;

public class Main {
    public static void main(String[] args) {
        Animal test = new Animal("AnimalTest",4);
        System.out.println("Nouvel animal nommé '"+test.getNom()+"' et agé de "+test.getAge()+" ans.");
        Lion testLion = new Lion("Panthera leo leo",11,"noire",72,"ee");
        testLion.afficherDetails();
        testLion.rugissement();

        Oiseau testfgdnom = new Oiseau("nom",5,"blanc",6);
        System.out.println("Nouvel animal nommé '"+testfgdnom.getNom()+"', agé de "+testfgdnom.getAge()+" ans,  ");
        testfgdnom.afficherDetails();
        testfgdnom.voler();

        // objet soigneur
        Soigneur soigneurLion = new Soigneur("veto",27,"Lion");
        soigneurLion.diagnostic();
    }
}