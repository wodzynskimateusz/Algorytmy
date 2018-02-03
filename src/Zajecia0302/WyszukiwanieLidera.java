package Zajecia0302;

public class WyszukiwanieLidera {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 1, 5, 0};

        int maxArr = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxArr < input[i])
                maxArr = input[i];
        }

        int[] tabZlicz = new int[maxArr + 1];

        for (int i = 0; i < input.length; i++)
            tabZlicz[input[i]]++;

        int maxWartosc = 0;
        int maxZliczen = 0;
        for (int i = 0; i < tabZlicz.length; i++) {
            if (tabZlicz[i] > maxZliczen) {
                maxZliczen = tabZlicz[i];
                maxWartosc = i;
            }
        }

        if (maxZliczen > (input.length) / 2)
            System.out.println(maxWartosc);
        else
            System.out.println(-1);

    }
}
