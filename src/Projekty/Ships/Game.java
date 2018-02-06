package Projekty.Ships;

public class Game {

    public Game(){}

    public static void play() {
        // tworze plansze
        Plansza plansza = new Plansza();

        // tworze statki
        Ship czteromasztowce = new Ship(1,4);
        Ship trzymasztowce = new Ship(2,3);
        Ship dwumasztowce = new Ship(3,2);
        Ship jednomasztowce = new Ship(4,1);

        // rozmieszczam stati
        plansza.placeShips(czteromasztowce);
        plansza.placeShips(trzymasztowce);
        plansza.placeShips(dwumasztowce);
        plansza.placeShips(jednomasztowce);

        // drukuje plansze
        System.out.println("Plansza:");
        System.out.println();
        plansza.printBoard();
        System.out.println();

        // komputer strzela
        System.out.println("Strzaly komputera:");
        System.out.println();
        plansza.strzelaj();


    }
}
