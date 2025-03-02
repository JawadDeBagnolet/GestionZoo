package zoo.personne;
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
}
