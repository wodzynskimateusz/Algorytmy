package Zajecia2701.Sortowania;

public class SortowaniePrzezWstawianie {
    public static void main(String[] args) {

        int[] toSort = {5, 7, 8, 6, 1, 2};

        for (int i = toSort.length - 2; i >= 0; i--) {
            int temp = toSort[i];
            int j = i + 1;
            while ((j < toSort.length) && (temp > toSort[j])) {
                toSort[j - 1] = toSort[j];
                j++;
            }
            toSort[j - 1] = temp;
        }

        for (int i = 0; i < toSort.length; i++) {
            System.out.print(toSort[i] + " ");
        }
    }
}
