package Projekty.OneHundredCounting;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private int hundred = 100;
    private int user = 0;

    public void play() {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (hundred > 1) {
            System.out.println("W puli: " + hundred);
            System.out.println("Podaj liczbe [1-10]");

            try {
                user = sc.nextInt();
            } catch (Exception ex) {
                sc.next();
                continue;
            }

            if (user > 0 && user < 11) {
                hundred -= user;
                if (hundred == 0) {
                    System.out.println("Koniec gry, wygrales!");
                    break;
                }
                System.out.println("W puli: " + hundred);
                int computer;

                if (hundred < 11) {
                    computer = hundred;
                } else {
                    computer = rand.nextInt(10) + 1;
                }
                System.out.println("Komputer wybral: " + computer);
                hundred -= computer;
                if (hundred == 0)
                    System.out.println("Koniec gry, przegrales!");
            } else {
                System.out.println("Bledna liczba");
                continue;
            }
        }
    }
}
