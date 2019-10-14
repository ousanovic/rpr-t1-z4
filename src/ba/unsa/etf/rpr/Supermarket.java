package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int brojArtikala;

    public Supermarket() {
        brojArtikala = 0;
        artikli = new Artikl[1000];
    }


    public Boolean dodajArtikl(Artikl a) {
        if(brojArtikala <= 50) {
            artikli[brojArtikala++] = a;
            return true;
        }
        return false;
    }
    public Artikl[] getArtikli() { return artikli; }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for(int i = 0; i < brojArtikala; i++)
            if(artikli[i].getKod().equals(kod)) {
                a = artikli[i];
                artikli[i] = artikli[brojArtikala-1];
                brojArtikala--;
                break;
            }
        return a;
    }
}
