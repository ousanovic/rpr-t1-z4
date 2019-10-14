package ba.unsa.etf.rpr;

public class Artikl {
    private String kod;
    private String naziv;
    private int cijena;
    public Artikl(String naziv,int cijena, String kod){
        this.naziv = naziv;
        this.kod = kod;
        this.cijena = cijena;
    }

    public String getKod() { return kod; }
    public String getNaziv() { return naziv; }
    public int getCijena() { return cijena; }
}
