package Zajecia0302;

public class WyszukiwanieMinMax {
    public static void main(String[] args) {

        String input = "[1,4,78,3,54,-1,-80,45,17]";
        String values = input.substring(input.indexOf("[") + 1, input.indexOf("]")).trim();
        String[] val = values.split(",");
        int[] valuesInt = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }

        int min = valuesInt[0];
        int max = valuesInt[0];
        int arrMin = 0;
        int arrMax = 0;

        // wyszukiwanie min i max
        for (int i = 0; i < valuesInt.length; i++) {
            if (valuesInt[i] < min) {
                min = valuesInt[i];
                arrMin = i;
            }
            if (valuesInt[i] > max) {
                max = valuesInt[i];
                arrMax = i;
            }
        }

        // drukowanie
        System.out.printf("Min: %d (%d)\n", arrMin, min);
        System.out.printf("Max: %d (%d)\n", arrMax, max);

    }
}
