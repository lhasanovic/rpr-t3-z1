package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;
import java.util.HashMap;

public class Imenik {

    private java.util.HashMap<String, TelefonskiBroj> imenik;

    public Imenik() {
        this.imenik = new java.util.HashMap<>();
    }

    static String getKeyByValue(final java.util.HashMap<String, TelefonskiBroj> map, TelefonskiBroj value) {
        for (Map.Entry<String, TelefonskiBroj> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }


    public HashMap<String, TelefonskiBroj> getImenik() {
        return imenik;
    }


    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }


    public TelefonskiBroj dajBroj(String ime){
//        if(imenik.containsKey(ime))
//            return imenik.get(ime);
//        else
//            return null;
        return imenik.getOrDefault(ime, null);
    }

    public String dajIme(TelefonskiBroj broj){
        return getKeyByValue(imenik, broj);
    }
    public String naSlovo(char s){

        StringBuilder stringBuilder = new StringBuilder();
        Set<String> set = imenik.keySet();
        for(String ime : set){
            if(ime.startsWith(Character.toString(s)))
                stringBuilder.append(imenik.get(ime) + "\n");
        }
        return stringBuilder.toString();
    }
    public Set <String> izGrada(Grad g){
        Set<String> ret = new HashSet<>();
        Set<TelefonskiBroj> set = (Set<TelefonskiBroj>) imenik.values();
        for(TelefonskiBroj broj : set){
            if(broj instanceof FiksniBroj){
                FiksniBroj fb = (FiksniBroj) broj;
                if(fb.getGrad() == g)
                    ret.add(fb.ispisi());
            }
        }
        return ret;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> ret = new HashSet<>();
        Set<TelefonskiBroj> set = (Set<TelefonskiBroj>) imenik.values();
        for(TelefonskiBroj broj : set){
            if(broj instanceof FiksniBroj){
                FiksniBroj fb = (FiksniBroj) broj;
                if(fb.getGrad() == g)
                    ret.add(fb);
            }
        }
        return ret;
    }
}

