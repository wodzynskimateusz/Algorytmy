package Zbior;

public class Zadanie12 {
    public static void main(String[] args) {

        char[] pesel = "12345678901".toCharArray();

        int[] mnoznik = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pesel.length; i++) {
            sum += Integer.parseInt(sb.append(pesel[i]).toString()) * mnoznik[i];
            sb.setLength(0);
        }

        if (sum % 10 == 0)
            System.out.println("Prawidlowy nr PESEL");
        else
            System.out.println("Nieprawidlowy nr PESEL");
    }
}
