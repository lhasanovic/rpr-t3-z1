package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {

    String drzava;


    public MedunarodniBroj(String drzava, String broj) {
        super(broj);
        this.drzava = drzava;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}