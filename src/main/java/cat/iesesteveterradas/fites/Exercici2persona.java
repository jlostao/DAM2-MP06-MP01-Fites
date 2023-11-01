package cat.iesesteveterradas.fites;

public class Exercici2persona {
    private String nom;
    private String cognom;
    private int any;

    public Exercici2persona (String nom, String cognom, int any) {
        this.nom = nom;
        this.cognom = cognom;
        this.any = any;
    }

    @Override
    public String toString() {
        return this.nom + " " + this.cognom + ", " + this.any;
    }
}
