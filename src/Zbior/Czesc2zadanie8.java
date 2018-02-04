package Zbior;

import java.util.Scanner;

public class Czesc2zadanie8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj kolejno trzy liczby");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0 && b == c)
        System.out.println("Rownanie ma nieskonczenie wiele rozwiazan");
        else if (a == 0 && b!=c)
            System.out.println("Rownanie nie ma rozwiazan");
        else {
            double solution = (c-b)/a;
            System.out.printf("Rozwiazanie rownania to: %.2f", solution);
        }
    }
}
