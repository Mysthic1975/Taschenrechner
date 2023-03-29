import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taschenrechner");
        System.out.print("Erste Zahl eingeben: ");
        int A = scanner.nextInt();

        System.out.print("Zweite Zahl eingeben: ");
        int B = scanner.nextInt();

        System.out.print("Rechenoperation auswählen (1 = +, 2 = -, 3 = *, 4 = /): ");
        int operator = scanner.nextInt();

        double ergebnis;
        if (operator == 1) {
            ergebnis = A + B;
        } else if (operator == 2) {
            ergebnis = A - B;
        } else if (operator == 3) {
            ergebnis = A * B;
        } else if (operator == 4) {
            if (B != 0) {
                ergebnis = (double) A / B;
            } else {
                System.out.println("Fehler: Division durch Null!");
                return;
            }
        } else {
            System.out.println("Ungültige Eingabe!");
            return;
        }

        System.out.println("Ergebnis: " + ergebnis);
    }
}
