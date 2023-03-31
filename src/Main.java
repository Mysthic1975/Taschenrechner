import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        int a, b;
        double ergebnis;
        char operator;
        String fortsetzen;
        double[] ergebnisHistorie = new double[10];
        int historieIndex = 0;
        boolean firstRun = true;

        do {
            if (firstRun) {
                System.out.println("Taschenrechner");
                firstRun = false;
            }
            System.out.print("Erste Zahl eingeben: ");
            while (!eingabe.hasNextInt()) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine ganze Zahl ein.");
                eingabe.next();
            }
            a = eingabe.nextInt();
            System.out.print("Zweite Zahl eingeben: ");
            while (!eingabe.hasNextInt()) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine ganze Zahl ein.");
                eingabe.next();
            }
            b = eingabe.nextInt();
            System.out.print("Rechenoperation auswählen (+, -, *, /): ");
            operator = eingabe.next().charAt(0);
            char[] operationen = {'+', '-', '*', '/'};
            for (char op : operationen) {
                if (op == operator) {
                    if (op == '+') {
                        ergebnis = a + b;
                        System.out.println("Das Ergebnis von " + a + "+" + b + " ist: " + ergebnis);
                        ergebnisHistorie[historieIndex] = ergebnis;
                        historieIndex++;
                        break;
                    } else if (op == '-') {
                        ergebnis = a - b;
                        System.out.println("Das Ergebnis von " + a + "-" + b + " ist: " + ergebnis);
                        ergebnisHistorie[historieIndex] = ergebnis;
                        historieIndex++;
                        break;
                    } else if (op == '*') {
                        ergebnis = a * b;
                        System.out.println("Das Ergebnis von " + a + "*" + b + " ist: " + ergebnis);
                        ergebnisHistorie[historieIndex] = ergebnis;
                        historieIndex++;
                        break;
                    } else if (b != 0) {
                        ergebnis = (double) a / (double) b;
                        System.out.println("Das Ergebnis von " + a + "/" + b + " ist: " + ergebnis);
                        ergebnisHistorie[historieIndex] = ergebnis;
                        historieIndex++;
                        break;
                    } else {
                        System.out.println("Division durch Null nicht möglich!");
                        break;
                    }
                }
            }
            do {
                System.out.print("Möchtest du eine weitere Berechnung durchführen? (j/E): ");
                fortsetzen = eingabe.next().toUpperCase();
            } while (!fortsetzen.equals("J") && !fortsetzen.equals("E"));
        } while (!fortsetzen.equals("E"));
        System.out.println("Die letzten Ergebnisse waren:");
        for (int i = 0; i < historieIndex; i++) {
            System.out.println(ergebnisHistorie[i]);
        }
        System.out.println("Danke für die Benutzung des Taschenrechners!");
    }
}
