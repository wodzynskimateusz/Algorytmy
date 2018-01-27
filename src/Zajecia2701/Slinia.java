package Zajecia2701;

public class Slinia {
    public static void main(String[] args) {
        System.out.println(silnia(4));
    }

    static int silnia(int n) {
        if (n == 1)
            return 1;
        else
            return (silnia(n - 1) * n);
    }

}
