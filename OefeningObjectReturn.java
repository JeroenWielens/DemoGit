package Voorbeeld2;

public class OefeningObjectReturn {
    public static void main(String[] args) {
        System.out.println("Welkom");
        ToegangsPoort tp = new ToegangsPoort();
        Persoon persoon = new Persoon();
        persoon.naam = "Henk";
        persoon.pasje.geblokkeerd = true;
        tp.toelaten(persoon);
        Beveiliger Jan = new Beveiliger();
        persoon.pasje = Jan.pasjeUitdelen(persoon);
        tp.toelaten(persoon);
    }
}

class ToegangsPoort {
    void toelaten(Persoon dePersoon) {
        if (dePersoon.pasje.geblokkeerd){
            System.out.println("Je bent niet toegelaten");
        }else {
            System.out.println("Je bent toegelaten, welkom " + dePersoon.naam);
        }
    }
}

class Persoon {
    String naam;
    Pasje pasje = new Pasje();
}

class Pasje {
    boolean geblokkeerd = false;
}

class Beveiliger {
    Pasje pasjeUitdelen(Persoon persoon) {
        if (persoon.pasje.geblokkeerd) {
            System.out.println("Even de gegevens checken");
            return new Pasje();
        }else{
            System.out.println("Val me niet lastig");
            return persoon.pasje;
        }
    }
}
