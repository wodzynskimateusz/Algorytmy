package PracaDomowa2;

public class Zadanie1 {
    public static void main(String[] args) {

        int[] input = {5, 1, 12, 1, 48, 4, 8, 45, 1, 5, 7, 62, 54, 7};

        for (int i = 0; i < input.length; i++) {
            int currentNumber = input[i];
            boolean finish = false;
            for (int j = i + 1; j < input.length; j++) {
                if (currentNumber == input[j]) {
                    System.out.printf("Liczba ktora powtorzyla sie jako pierwsza to: %d, wystepuje ona na %d i %d miejscu w tablicy.\n",
                            currentNumber, i, j);
                    finish = true;
                    break;
                }
            }
            if (finish)
                break;
            if (i == input.length - 1 && (!finish))
                System.out.println("Zadna liczba nie powtorzyla sie.");
        }
    }
}
