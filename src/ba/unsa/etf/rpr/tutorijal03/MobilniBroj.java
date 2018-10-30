package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;

    public MobilniBroj(int mobilnaMreza, String broj) {
        super(broj);
        this.mobilnaMreza = mobilnaMreza;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    @Override
    public String ispisi() {
        return mobilnaMreza + this.getBroj();
    }
}
