package Zbior;

public class Zadanie5 {
    public static void main(String[] args) {

        String[] dniTygodnia = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sb", "Nd"};

        String user = "Nd 0";
        String[] parts = user.split(" ");
        String part1 = parts[0];
        int part2 = Integer.valueOf(parts[1]);
        int index = -1;

        for (int i = 0; i < dniTygodnia.length ; i++) {
            if (part1.equals(dniTygodnia[i])){
                index = i;
                break;
            }
        }
        System.out.println(dniTygodnia[(index+part2)%7]);
    }
}
