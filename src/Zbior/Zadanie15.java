package Zbior;

import java.util.Stack;

public class Zadanie15 {
    public static void main(String[] args) {

        String input = "3 5 2 * +";
        String[] inputArray = input.split(" ");

        Stack<Integer> S = new Stack<>();

        int result = 0;

        for (String s : inputArray) {
            try {
                int element = Integer.parseInt(s);
                // jezli uda nam sie sparsowac czyli nie polecial wyjatek to wrzucamy na stos
                S.push(element);
            } catch (Exception ex) {
                switch (s) {
                    case "*":
                        result = S.pop() * S.pop();
                        S.push(result);
                        break;
                    case "/":
                        result = S.pop() * S.pop();
                        S.push(result);
                        break;
                    case "-":
                        result = S.pop() - S.pop();
                        S.push(result);
                        break;
                    case "+":
                        result = S.pop() + S.pop();
                        S.push(result);
                        break;
                }
            }
        }
        System.out.println(S.pop());
    }
}
