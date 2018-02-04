package Zajecia0302;

import java.util.Scanner;
import java.util.Stack;

public class StosSystemBinarny {
    public static void main(String[] args) {

        Stack<Integer> S = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Jaka liczbe chcesz zamienic na system dwojkowy?");
        int L = sc.nextInt();

        while (L > 0) {
            S.push(L % 2);
            L = Math.floorDiv(L, 2);
        }

        while (!S.empty()){
            System.out.print(S.peek());
            S.pop();
        }
    }
}
