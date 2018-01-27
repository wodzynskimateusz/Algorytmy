package Zajecia2701;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz podac?");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Podales bledne dane");
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            try {
                sum += sc.nextInt();
                System.out.println(sum);
            } catch (Exception e) {
                sc.next();
                System.out.println(sum);
            }
        }
    }
}
