package Zbior;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ile zestawow podasz?");
        int liczbaZestawow = sc.nextInt();
        int index = 0;
        int [][] daneZestawow = new int[liczbaZestawow][4];

        System.out.println("Podaj dane");
        sc.nextLine();
        for (int i = 0; i < liczbaZestawow; i++) {
            String[] str = sc.nextLine().trim().split( " ");
            daneZestawow[i][0] = Integer.parseInt(str[0]);
            daneZestawow[i][1] = Integer.parseInt(str[1]);
            daneZestawow[i][2] = Integer.parseInt(str[2]);

            int x = daneZestawow[i][0];
            int y = daneZestawow[i][1];
            int z = daneZestawow[i][2];

            if (z == 0)
                daneZestawow[i][3] = 0;
            else
                daneZestawow[i][3] = Math.abs(12*(y*z-x-y)/(1-z));
        }


        for (int i = 0; i < daneZestawow.length; i++) {
            System.out.println(daneZestawow[i][3]);
        }
    }
}
