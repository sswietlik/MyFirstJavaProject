package com.coderslab.c_Operatory;

public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a + "   w o1 do wartości a=1 zwiększamy wartość o +1 wyświetlana jest wartość 2");
		System.out.println(a++ + "   w o2 wartość a=2 zwiększa się o +1 ale wyświetlana jest wartość 2");
		System.out.println(a + "   w o3 wartość przyjmuje wynik końcową o2 wyświetlana jest wartość 3");
		b=a++;
				System.out.println("     W niewidocznym obiegu o4 wartość a zostaje zwiększona o postać a++ powinno wyświetlić 3");
		System.out.println(a + "   w o5 wartość a pozostaje bez zmian czyli przyjmuje postać konczaca obieg o4 wyświetla wartość to 4 ");
		b=++a;
				System.out.println("     W niewidocznym obiegu o6 wartość a zostaje zwiększona o postać ++a powinno wyświetlić 5");
		System.out.println(++a + "   W obiegu o7 zwiekszamy wartosc a o postać ++a czyli zwiekszamy wynik o6 wyświetla wartość 6");
	}

}
