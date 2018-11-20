package Voorbeeld2;

public class OefeningObjectReturn {
    public static void main(String[] args) {
        System.out.println("Welkom");
        ToegangsPoort tp = new ToegangsPoort();
        tp.toelaten();
    }
}

class ToegangsPoort {
    void toelaten() {
        System.out.println("Je bent toegelaten");
    }
}


