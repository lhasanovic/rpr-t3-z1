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
    public abstract String ispisi();
    int compareTo(TelefonskiBroj o){
        return Ispisi().compareTo(o.Ispisi());
    }

}
