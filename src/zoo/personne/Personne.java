package personne;

public class Personne {
    private String nomPrenom;
    private int age;

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

}
