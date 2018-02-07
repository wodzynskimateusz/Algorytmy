package Projekty.PaperScissorsRock;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private int games = 0;
    private int computerScore = 0;
    private int userScore = 0;

    private Choices computerChoice;
    private Choices userChoice;

    public void play() {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz ruch: q - wyjscie z gry, n - nozyce, k - kamien, p - papier");
            String userIn = sc.next();
            userIn = userIn.toLowerCase().trim();

            // warunek wyjscia
            if (userIn.equals("q")) {
                System.out.println("Koniec gry");
                break;
            }

            // wybor gracza
            if (userIn.equals("k") || userIn.equals("n")
                    || userIn.equals("p")) {
                userChoice = Choices.getEnumString(userIn);
            } else {
                System.out.println("Błędny wybór");
                continue;
            }

            // wybor komputera
            int computerInput = rand.nextInt(3);
            computerChoice = Choices.getEnumInt(computerInput);

            games++;
            win();

            System.out.println("Liczba gier: " + games + ", wygrałeś: " + userScore + " razy, przegrales: "
                    + computerScore + " razy.");

        }
    }

    private void win() {
        if (userChoice.equals(computerChoice)) {
            System.out.println("Remis");
        } else if (userChoice.equals(Choices.ROCK) && computerChoice.equals(Choices.PAPER)) {
            System.out.println("Przegrales, komputer wskazal papier");
            computerScore++;
        } else if (computerChoice.equals(Choices.ROCK) && userChoice.equals(Choices.PAPER)) {
            System.out.println("Wygrales! Komputer wskazal kamien");
            userScore++;
        } else if (computerChoice.equals(Choices.ROCK) && userChoice.equals(Choices.SCISSORS)) {
            System.out.println("Przegrales, komputer wskazal kamien");
            computerScore++;
        } else if (userChoice.equals(Choices.ROCK) && computerChoice.equals(Choices.SCISSORS)) {
            System.out.println("Wygrales! Komputer wskazal nozyczki");
            userScore++;
        } else if (computerChoice.equals(Choices.PAPER) && userChoice.equals(Choices.SCISSORS)) {
            System.out.println("Wygrales! Komputer wskazal papier");
            userScore++;
        } else if (userChoice.equals(Choices.PAPER) && computerChoice.equals(Choices.SCISSORS)) {
            System.out.println("Przegrales, komputer wskazal nozyczki");
            computerScore++;
        }
    }
}