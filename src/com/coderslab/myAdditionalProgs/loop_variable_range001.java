package com.coderslab.myAdditionalProgs;

public class loop_variable_range001 {
    public static void main(String[] args){

        int a = 9;
        System.out.println(a);

        for (int i = 0; i < 10; i++){
            String b = " Test ";
            System.out.println(i);
            System.out.println(b);
            System.out.println(a);

        }

        System.out.println(a);  // zmienna a jest zadeklarowana poza pętlą for dlatego kompilator nie zgłasza błędu
 //       System.out.println(i);  //zgłasza błąd ponieważ zmienna i oraz b istnieją tylko w pętli
 //       System.out.println(b);



    }
}
