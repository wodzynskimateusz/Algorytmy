package Zbior;

public class Zadanie10 {
    public static void main(String[] args) {

        System.out.println("NWD: " + NWD(3, 18));
    }

    public static int NWD(int a, int b) {
        while (a != b) {
            if (a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }
}
