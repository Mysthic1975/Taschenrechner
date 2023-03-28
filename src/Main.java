import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Einfacher Taschenrechner");
        System.out.print("Erste Zahl eingeben: ");
        int ersteZahl = scanner.nextInt();

        System.out.print("Zweite Zahl eingeben: ");
        int zweiteZahl = scanner.nextInt();

        int ergebnis = ersteZahl + zweiteZahl;
        System.out.println("Ergebnis: " + ergebnis);
    }
}