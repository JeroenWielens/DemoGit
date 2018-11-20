package Voorbeeld2;

public class OefeningObjectReturn {
    public static void main(String[] args) {
        System.out.println("Welkom");
        ToegangsPoort tp = new ToegangsPoort();
        Persoon persoon = new Persoon();
        persoon.naam = "Henk";
        tp.toelaten(persoon);
    }
}

class ToegangsPoort {
    void toelaten(Persoon dePersoon) {
        if (true){
            System.out.println("Je bent toegelaten, welkom " + dePersoon.naam);
        }else {
            System.out.println("Je bent niet toegelaten");
        }
    }
}

class Persoon {
    String naam;
//    Pasje pasje;
}


