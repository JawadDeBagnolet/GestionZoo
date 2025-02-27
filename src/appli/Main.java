package appli;
import zoo.animaux.*;
public class Main {
    public static void main(String[] args) {
        Animal test = new Animal("AnimalTest",4);
        System.out.println("Nouvel animal nommé '"+test.getNom()+"' et agé de "+test.getAge()+" ans.");
        Lion testLion = new Lion("Panthera leo leo",11,"noire");
        System.out.println("Nouveau lion nommé '"+testLion.getNom()+"' et agé de "+testLion.getAge()+" ans.");
        testLion.rugissement();
    }
}