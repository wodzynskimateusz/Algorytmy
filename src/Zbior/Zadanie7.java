package Zbior;

public class Zadanie7 {
    public static void main(String[] args) {

        String user = "55 22";
        String[] parts = user.split(" ");
        int part1 = Integer.valueOf(parts[0]);  // liczba cukierkow
        int part2 = Integer.valueOf(parts[1]);  // liczba osob w klasie

        if (part2 > part1) {
            System.out.println("Nie masz wystarczajace liczy cukierkow :(");
        } else {
            if (part1 % part2 == 0)
                System.out.println("NIE");
            else {
                int zostanieCukierkow = part1 - (Math.floorDiv(part1, part2) * (part2 - 1)); //Jas zaliczany do part2
                System.out.println("TAK " + zostanieCukierkow);
            }
        }
    }
}
