package Zajecia0302;

import java.util.Scanner;
import java.util.Stack;

public class StosSystemSzesnastkowy {
    public static void main(String[] args) {

        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Jaka liczbe chcesz zamienic na system szestnastkowy?");
        int user = sc.nextInt();

        while (user > 0) {
            int wynikModulo = user % 16;
            if (wynikModulo < 10)
                st.push(String.valueOf(wynikModulo));
            else if (wynikModulo == 10)
                st.push("A");
            else if (wynikModulo == 11)
                st.push("B");
            else if (wynikModulo == 12)
                st.push("C");
            else if (wynikModulo == 13)
                st.push("D");
            else if (wynikModulo == 14)
                st.push("E");
            else if (wynikModulo == 15)
                st.push("F");
            user = Math.floorDiv(user, 16);
        }

        while (!st.empty()) {
            System.out.print(st.peek());
            st.pop();
        }

    }
}
