package com.coderslab.d_Kontrola_Przeplywu_programu;

public class Main3 {
    public static void main(String[] args) {

        String tekst = "LUBIĘ JAVĘ";
        int i = 0;
        int j = 1;

        for (i = 1; i <= 10; i = ++i) {
            System.out.println(i + "  " +tekst + " for ");
        }

        System.out.println(" ");

        while (j <= 10) {
            System.out.println(j++ + "  " +tekst + " while ");
        }
    }
}



//
//#### Zadanie 3
//
//        1. W pliku `Main3.java` stwórz pętlę, która 10 razy wypisze w konsoli tekst: *"Lubię Javę"*.
//        2. Napisz zarówno pętlę `for` jak i pętlę `while`.
//        3. W sumie napis będzie widoczny 20 razy.