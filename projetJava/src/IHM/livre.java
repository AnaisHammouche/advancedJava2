package IHM;

public class livre {
    private String name;
    private String auteur;
    private String resume;
    private int colonnes;
    private int ligne;
    private int parution;

    public livre(String name, String auteur, String resume, int colonnes, int ligne, int parution) {
        this.name = name;
        this.auteur = auteur;
        this.resume = resume;
        this.colonnes = colonnes;
        this.ligne = ligne;
        this.parution = parution;
    }
}
