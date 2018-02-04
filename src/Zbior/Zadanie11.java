package Zbior;

public class Zadanie11 {
    public static void main(String[] args) {

        int a = 9;
        int b = 12;

        int nww = a*b/NajwWslDziel(a,b);
        System.out.println("NWW: " + nww);

    }

    public static int NajwWslDziel(int a, int b) {
        while (a != b) {
            if (a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }
}
