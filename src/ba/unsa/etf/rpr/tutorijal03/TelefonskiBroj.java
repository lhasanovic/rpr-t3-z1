package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj {

    private String broj;

    public TelefonskiBroj(String broj) {
        this.broj = broj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public abstract int hashCode();

    public abstract String ispisi();
}
