import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        int a, b;
        int ErgebnisGanzzahl;
        char Operator;
        double ErgebnisKommazahl;
        double c, d;
        String fortsetzen;

        do {
            System.out.println("Taschenrechner");
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
            Operator = eingabe.next().charAt(0);

            if (Operator == '+') {
                ErgebnisGanzzahl = a + b;
                System.out.println("Das Ergebnis von " + a + " + " + b + " ist: " + ErgebnisGanzzahl);
            } else if (Operator == '-') {
                ErgebnisGanzzahl = a - b;
                System.out.println("Das Ergebnis von " + a + " - " + b + " ist: " + ErgebnisGanzzahl);
            } else if (Operator == '*') {
                ErgebnisGanzzahl = a * b;
                System.out.println("Das Ergebnis von " + a + " * " + b + " ist: " + ErgebnisGanzzahl);
            } else if (Operator == '/' && b != 0) {
                c = Double.valueOf(a);
                d = Double.valueOf(b);

                ErgebnisKommazahl = c / d;
                System.out.println("Das Ergebnis von " + a + " / " + b + " ist: " + ErgebnisKommazahl);
            } else if (Operator == '/' && b == 0) {
                System.out.println("Division durch Null nicht möglich!");
            } else {
                System.out.println("Ungültige Eingabe! Bitte wählen Sie eine gültige Rechenoperation (+, -, *, /).");
            }

            while (true) {
                System.out.print("Möchtest du eine weitere Berechnung durchführen? (j/E): ");
                fortsetzen = eingabe.next().toUpperCase();
                if (fortsetzen.equals("J") || fortsetzen.equals("E")) {
                    break;
                }
            }
        } while (!fortsetzen.equals("E"));

        // Nachricht am Ende des Programms ausgeben
        System.out.println("Danke für die Benutzung des Taschenrechners!");
    }
}
