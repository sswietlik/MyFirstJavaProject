package com.coderslab.d_Kontrola_Przeplywu_programu;

public class Main1 {
    public static void main(String[] args) {
        int nr1 = 1;
        int nr2 = 2;

        if (nr2 > nr1){
            System.out.println(nr2 + " is bigger then " + nr1);
        } else if (nr1 > nr2){
            System.out.println(nr1 + " is bigger then " + nr2);
        } else {
            System.out.println("...");
        }


    }
}

//#### Zadanie 1
//
//        1. W pliku `Main1.java` stwórz dwie zmienne, o nazwach: `nr1, nr2`, przechowujące liczby całkowite.
//        2. Następnie za pomocą instrukcji warunkowej ```if ... else ```, wypisz w konsoli, która z nich jest większa.
//        3. Wypisany String ma być wg wzoru: `Większa liczba to 7.`