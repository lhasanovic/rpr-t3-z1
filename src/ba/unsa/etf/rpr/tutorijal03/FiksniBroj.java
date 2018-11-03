package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    private Grad grad;

    public FiksniBroj(Grad grad, String broj) {
        super(broj);
        this.grad = grad;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    @Override
    public String ispisi() {
        return grad.toString() + "/" + this.getBroj();
    }
}
