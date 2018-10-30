package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;
public class Imenik {
    private HashMap<TelefonskiBroj,String> imenik;

    public Imenik(String ime) {
        this.imenik=new HashMap<TelefonskiBroj,String>();
    }

    public HashMap<TelefonskiBroj, String> getImenik() {
        return imenik;
    }

    public Void dodaj(String ime, TelefonskiBroj broj){
        this.getImenik().put(broj,ime);

    }


    public String dajBroj(String ime){

    }
    public String dajIme(TelefonskiBroj broj){
        

    }
    public String naSlovo(char s){


    }
    public Set <String> izGrada(Grad g){

    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){

    }
}

