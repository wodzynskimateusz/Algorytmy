package Zbior;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Czesc2zadanie5 {
    public static void main(String[] args) throws FileNotFoundException {

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};
        int[] counter = new int[letters.length];

        File file = new File("E:\\SDA\\Algorytmy\\src\\Zbior\\File.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            char[] userInput = line.toCharArray();
            for (int i = 0; i < userInput.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if (userInput[i] == letters[j])
                        counter[j]++;
                }
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0)
                System.out.printf("%s %d\n", letters[i], counter[i]);
        }
    }
}
