public class Main
{
    public static void main(String[] args)
    {
        int A, B;                                                           // Hilfsvariablen zum Rechnen
        float C, D;                                                         // Komma
        double E, F;                                                        // Komma
        int Summe;                                                          // Addition
        int intDifference;                                                  // Subtraktion
        float floatDifference;                                              // Subtraktion mit Komma
        int Product;                                                        // Multiplikation
        int Qoutient;                                                       // Division

        A = 10;
        B = 5;
        C = 4.4f;
        D = 8.8f;
        E = 10.5;
        F = 5.5;

        Summe = A + B;
        intDifference = A - B;
        floatDifference = D - C;
        double Ergebnis = E - F;
        Product = A * B;
        Qoutient = A / B;

        System.out.println ("A :" + A);                                     // Kommentar
        System.out.println ("A + A: " + A + A);
        System.out.println ("Addition: " + Summe);
        System.out.println ("Subtraktion: " + intDifference);
        System.out.println ("Float Subtraktion: " + floatDifference );
        System.out.println ("Double Subtraktion: " + Ergebnis);
        System.out.println ("Multiplikation: " + Product);
        System.out.println ("Division: " + Qoutient);
        System.out.println ("Hello world!");

    }
}