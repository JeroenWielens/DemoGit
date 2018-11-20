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
        if (true){
            System.out.println("Je bent toegelaten");
        }else {
            System.out.println("Je bent niet toegelaten");
        }
    }
}


