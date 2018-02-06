package Projekty.Ships;

import java.util.Random;

public class Plansza {
    Random rand = new Random();

    private int size = 10;
    public String[][] plansza = new String[size + 2][size + 2];

    // * - puste pole
    // X - statek
    // O - pole trafione

    public Plansza() {
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                plansza[i][j] = "*";
            }
        }
        for (int i = 1; i < 11; i++) {
            plansza[0][i] = String.valueOf(i);
        }
        plansza[1][0] = "A";
        plansza[2][0] = "B";
        plansza[3][0] = "C";
        plansza[4][0] = "D";
        plansza[5][0] = "E";
        plansza[6][0] = "F";
        plansza[7][0] = "G";
        plansza[8][0] = "H";
        plansza[9][0] = "I";
        plansza[10][0] = "J";
        plansza[0][0] = " ";
    }


    public void printBoard() {
        for (int i = 0; i < plansza.length - 1; i++) {
            for (int j = 0; j < plansza[i].length - 1; j++) {
                System.out.print(plansza[i][j] + " ");
            }
            System.out.println();
        }
    }


    private boolean noShipsAround(int x, int y) {
        for (int a = x - 1; a <= x + 1; a++) {
            for (int b = y - 1; b <= y + 1; b++) {
                if (a > 0 && b > 0 && a < plansza.length - 1 && b < plansza[x].length - 1 && (x != a || y != b)) {
                    if (!plansza[a][b].equals("*")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    private boolean isThisShip(int x, int y) {
        if (plansza[x][y].equals("X"))
            return true;
        else
            return false;
    }


    private boolean canGoTwoFieldsMore(int x, int y, int a, int b) {
        if (isThisShip(x + a, y + b) || isThisShip(x + a + a, y + b + b))
            return false;
        else
            return true;
    }

    private boolean gameFinished() {
        for (int i = 1; i < plansza.length - 1; i++) {
            for (int j = 1; j < plansza[i].length - 1; j++) {
                if (plansza[i][j].equals("X")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void strzelaj() {
        int shot = 1;
        while (!gameFinished()) {
            int x = rand.nextInt(10) + 1;
            int y = rand.nextInt(10) + 1;

            if (plansza[x][y].equals("X")) {
                System.out.printf("Strzal nr %d: %s%s - trafiony\n", shot, plansza[x][0], plansza[0][y]);
                plansza[x][y] = "T";
                shot++;
            } else if (plansza[x][y].equals("*")) {
                System.out.printf("Strzal nr %d: %s%s - pudlo\n", shot, plansza[x][0], plansza[0][y]);
                plansza[x][y] = "P";
                shot++;
            }
        }
        System.out.println("Koniec gry!");
    }


    public void placeShips(Ship statek) {
        int shipsNumber = statek.getShipsNumber();

        while (shipsNumber > 0) {

            // losuje wspolrzedna pierwszego masztu
            int x = rand.nextInt(10) + 1;
            int y = rand.nextInt(10) + 1;

            // ustawiam pierwszy maszt
            if (noShipsAround(x, y) && !isThisShip(x, y)) {
                plansza[x][y] = "X";
                int mastsNumber = statek.getMastsNumber() - 1;

                // ustawiam reszte masztow
                while (mastsNumber > 0) {
                    int krok = rand.nextInt(4);   //losuje z ktorej stony stanie kolejny maszt

                    //po prawej
                    if (krok == 0) {
                        if (y > 0 && y < 10) {
                            if (canGoTwoFieldsMore(x, y, 0, 1)
                                    && canGoTwoFieldsMore(x + 1, y, 0, 1)
                                    && canGoTwoFieldsMore(x - 1, y, 0, 1)) {
                                y = y + 1;
                                plansza[x][y] = "X";
                                mastsNumber--;
                            }
                        }
                    }

                    // po lewej
                    else if (krok == 1) {
                        if (y > 1 && y < 11) {
                            if (canGoTwoFieldsMore(x, y, 0, -1)
                                    && canGoTwoFieldsMore(x + 1, y, 0, -1)
                                    && canGoTwoFieldsMore(x - 1, y, 0, -1)) {
                                y = y - 1;
                                plansza[x][y] = "X";
                                mastsNumber--;
                            }
                        }
                    }

                    // na gorze
                    else if (krok == 2) {
                        if (x > 1 && x < 11) {
                            if (canGoTwoFieldsMore(x, y, -1, 0)
                                    && canGoTwoFieldsMore(x, y - 1, -1, 0)
                                    && canGoTwoFieldsMore(x, y + 1, -1, 0)) {
                                x = x - 1;
                                plansza[x][y] = "X";
                                mastsNumber--;
                            }
                        }
                    }

                    // na dole
                    else if (krok == 3) {
                        if (x > 0 && x < 10) {
                            if (canGoTwoFieldsMore(x, y, 1, 0)
                                    && canGoTwoFieldsMore(x, y - 1, 1, 0)
                                    && canGoTwoFieldsMore(x, y + 1, 1, 0)) {
                                x = x + 1;
                                plansza[x][y] = "X";
                                mastsNumber--;
                            }
                        }
                    }
                }
                shipsNumber--;
            }
        }
    }
}


