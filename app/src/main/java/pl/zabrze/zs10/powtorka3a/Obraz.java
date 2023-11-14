package pl.zabrze.zs10.powtorka3a;

public class Obraz {
    private String nazwa;
    private int idObrazka;

    public Obraz(String nazwa, int idObrazka) {
        this.nazwa = nazwa;
        this.idObrazka = idObrazka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    @Override
    public String toString() {
        return "Obraz: " + nazwa ;
    }
}
