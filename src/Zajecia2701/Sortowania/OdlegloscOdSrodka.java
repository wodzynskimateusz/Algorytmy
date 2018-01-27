package Zajecia2701.Sortowania;

import java.util.Scanner;

public class OdlegloscOdSrodka {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ile punktow chcesz wprowadzic?");
        int n = Integer.parseInt(sc.nextLine());

        int[][] input = new int[n][3];
        double[][] sort = new double[n][2];

        for (int i = 0; i < n; i++) {
            String inputFromUser = sc.nextLine();
            String[] inputSpliter = inputFromUser.split(" ");
            input[i][0] = Integer.parseInt(inputSpliter[0]);  // nazwa
            input[i][1] = Integer.parseInt(inputSpliter[1]);  // x
            input[i][2] = Integer.parseInt(inputSpliter[2]);  // y

            sort[i][0] = input[i][0]; // nazwa
            sort[i][1] = policzOdleglosc(input[i][1], input[i][2]);  //przypisywanie odleglosc
        }

        // sortowanie babelkowe

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1; j++) {
                if (sort[j][1] > sort[j+1][1]){
                    //SWAP
                    double temp = sort[j][0];
                    sort[j+1][0] = sort[j][0];
                    sort[j][0] = temp;

                    temp = sort[j][1];
                    sort[j][1] = sort[j+1][1];
                    sort[j+1][1] = temp;
                }
            }
        }

        for (int i = 0; i <input.length ; i++) {
            int nazwa = (int) sort[i][0];
            for (int j = 0; j < input.length; j++) {
                if (nazwa == input[j][0]){
                    System.out.printf("%d %d %d\n", input[j][0], input[j][1], input[j][2]);
                    break;
                }
            }
        }
    }

    public static double policzOdleglosc(int x, int y) {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
}
