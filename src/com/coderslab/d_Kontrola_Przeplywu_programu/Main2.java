package com.coderslab.d_Kontrola_Przeplywu_programu;

public class Main2 {
    public static void main(String[] args) {
        int nr1 = 1;
        int nr2 = 2;
        int nr3 = 3;
        String biggest;

        if ((nr1 > nr2) || (nr1 > nr3)){
            biggest = " nr 1 is bigest ";
            System.out.println(biggest);
        }
    }
}




//#### Zadanie 2
//
//        1. W pliku `Main2.java` stwórz trzy zmienne, o nazwach: `nr1, nr2, nr3`, przechowujące liczby całkowite.
//        2. Następnie, za pomocą instrukcji warunkowej `if ... else if ... else`, wypisz w konsoli, która z nich jest największa.
//        3. Wypisany String ma być wg wzoru: `Największa z liczb 7,2,11 to 11.`. Pamiętaj, aby wypisywać liczby przy pomocy zmiennych.