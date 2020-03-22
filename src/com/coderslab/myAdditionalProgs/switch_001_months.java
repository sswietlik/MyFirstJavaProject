package com.coderslab.myAdditionalProgs;

public class switch_001_months {
    public static void main(String[]args){
        int month = 11;
        String monthString;
        switch (month) {
            case 1: monthString = " Styczeń ";
                break;
            case 2: monthString = " Luty ";
                break;
            case 3: monthString = " Marzec ";
                break;
            case 4: monthString = " Kwiecień ";
                break;
            case 5: monthString = " Maj ";
                break;
            case 6: monthString = " Czerwiec ";
                break;
            case 7: monthString = " Lipiec ";
                break;
            case 8: monthString = " Sierpień ";
                break;
            case 9: monthString = " Wrzesień ";
                break;
            case 10: monthString = " Październik ";
                break;
            case 11: monthString = " Listopad ";
                break;
            case 12: monthString = " Grudzień ";
                break;
            default: monthString = " Wrong data ";
                break;
        }
        System.out.println(monthString);



    }
}
