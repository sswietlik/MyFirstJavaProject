package com.coderslab.myAdditionalProgs;

public class switch_002_string_in_switch {
static void main(String[]args) {


    String name = "Marek";
    switch (name) {
        case "Janek":                               //in CASE program znajdzie slowo "Janek " wyświetli komendę Cześć Janek
            System.out.println("Cześć Janek");
            break;
        case "Marek":
            System.out.println("Cześć Marek");
            break;
        default:                                    // in "case" nie znalezienia zapisanego Stringa program zastosuje definicję default
            System.out.println("Nieznajomy");
    }
}

}
