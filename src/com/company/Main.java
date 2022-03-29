package com.company;

public class Main {

    public static void main(String[] args) {

        // HTML - hypertext transfer markup language -> język znaczników
        // Język programowania to taki język który jest KOMPILOWANY

        // To jest komentarz liniowy

        /*
        To jest
        komentarz
        grupowy
         */

        // System.out.println(teskt) -> drukuj teskst na ekran i od razu po nim przenosi do nowej lini
        System.out.print("Hello world!"); // Hello world!
        System.out.println("Hello world!"); // Hello world! oraz enter
        System.out.print("Hello world!");
        System.out.println("Hello world!"); //Hello world -> spacj -> linijka nizej -> Hello world

        // Znaki specjalne
        // \n - nowa linie    \t - TAB (4spacje)
        System.out.print("hello\tworld!\n");
        System.out.println(" 123");

        // sout -> enter -> generuje System.out.println()
        System.out.println("doopa");

        // int (ang integer) typ calkowity przechwoujacy liczby calkowite np -3, -2, 1, 100, 1500
        // = -> operator przypisania wartosci z prawej strony do zmiennej znajdujacej sie po lewej stronie


        int a = 2;   // Defnicja zmiennych to TYP NAZWA = WARTOSC -> tworzymy zmienna i nadajemy jej wartosc
        int b;      // Deklaracja zmiennych to TYP NAZWA; -> tworzymy zmienna, nie nadajemy wartosci
        System.out.println(a);
        System.out.println(a);
        // Błąd -> zmienna B jeszcze nie została zainicjalizowana -> System.out.println(b);

        // Kompilowanie / Budowanie -> Tlumaczenie kodu programistycznego na kod "komputerowy"
        // 1010 0010 1110 1011 1000
        a = 1;
        System.out.println(a);

        b = 100;
        System.out.println(b);

        // double (ang podwojnej precyzji) -> typ przechwoujacy liczby rzeczywiste/zmienneprzecinkowe
        double c = 3.14;
        System.out.println(c);

        c = 5.5;
        System.out.println(c);

        // String (ang lancuch) - typ zmiennej przechwoujacej lancuch/tekst
        String d = "Ala ma kota!";
        System.out.println(d);

        d = "aaa";
        System.out.println(d);

        // Typ zmiennej BOOL (ang od nazwiska Bool -> gosciu ktory wynalazl algebre boolowska)
        // zmienna typu boolean przechwouje tylko dwie wartosc -> albo true albo false
        boolean e = true;
        System.out.println(e);
        e = false;
        System.out.println(e);

        // Podstawowe operacje -> +, -, *, /
        int aa = 10, bb = 5;
        int suma = aa + bb;
        int roznica = aa - bb;
        int mnozenie = aa*bb;
        int dzielenie = aa/bb;
        // konkatenacja -> łąnczenie tekstu ze zmienną
        System.out.println("Suma:" + suma + " " + roznica); // HINT
        System.out.println(roznica);
        System.out.println(mnozenie);
        System.out.println(dzielenie);
        System.out.println();

        /*
        1.  a) Zadeklaruj dwie zmienne typu double
            b) w nowych zmiennych przechowaj ich -,+,*,/
            c) Wypisz na ekran (W JEDNEJ LINI UZYWAJAC JEDNEGO SYSO) ich wynik operacji ladnie sformatowany
        2. Zadeklaruj zmienna typu INT oraz typu DOUBLE -> wykonaj na nich wszystkie 4 operacje i wyswietl na ekran
        3. Wypisz na ekran dlugosc Stringa "Ala ma kota!" -> 12
         */
        // ZADANIA

        //1.

        // Nazwy zmiennych z malej litery
        double zz = 2.5, xx = 3.5;
        double Suma = zz+xx;
        double Roznica = zz-xx;
        double Mnozenie = zz*xx;
        double Dzielenie = zz/xx;
        System.out.println("Suma:" +Suma + " " + "Roznica:" + Roznica + " " + "Mnozenie:" + Mnozenie + " " + "Dzielenie:" + Dzielenie);

        System.out.println();

        //2. Zadeklaruj zmienna typu INT oraz typu DOUBLE -> wykonaj na nich wszystkie 4 operacje i wyswietl na ekran

        int cc = 5;
        double vv = 2.7;
        double Summa = cc+vv;
        double Roznicaa = cc-vv;
        double Mnozeniee = cc*vv;
        double Dzieleniee = cc/vv;
        System.out.println("Summa:" + Summa + " " + "Roznicaa:" + Roznicaa + " " + "Mnozeniee:" + Mnozeniee + " " + "Dzieleniee:" + Dzieleniee);

        System.out.println();

        System.out.println(5 * 2.0);
        // Rzutowanie -> "Casting types in Java"
        int uu = 5;
        double uud = Double.valueOf(uu); // Najprostsze rzutowanie to Typ.valueOf()
        System.out.println(uud);

        //3. Wypisz na ekran dlugosc Stringa "Ala ma kota!" -> 12

        String text = "Ala ma kota!";
        int len = text.toCharArray().length;
        System.out.println(len);
        System.out.println();

        // toCharArray creates array (szyk) of characters

        String[] cars = {"Volvo ",  "BMW", "Audi", "Mercedes", };
        System.out.println(cars[1]);
        // array moze byc rowniez uzyte do przechowania lilku stringow a pozniej do printowania ich uzywajac 1,2 itp.

        System.out.println("Dlugosc string: " + text.length());

    }
}
