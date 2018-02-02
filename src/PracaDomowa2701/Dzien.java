package PracaDomowa2701;

public class Dzien {

    private String data;
    private String[] dataString;
    private int dzien = 1;
    private int miesiac = 1;
    private int rok = 2018;
    private int[] dniMiesiaca = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Dzien() {
    }

    public Dzien(String data) {
        this.data = data;
        dataString = data.split(" ");
        setRok(Integer.parseInt(dataString[2]));
        setMiesiac(Integer.parseInt(dataString[1]));
        setDzien(Integer.parseInt(dataString[0]));
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        if (miesiac > 0 & miesiac < 13)
            this.miesiac = miesiac;
        else
            System.out.println("Podales bledny miesiac");
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        if (miesiac == 2 && isLeap(rok)) {
            if (dzien > 0 && dzien <= dniMiesiaca[miesiac] + 1) {
                this.dzien = dzien;
            } else
                System.out.println("Nie ma takiego dnia");
        } else {
            if (dzien > 0 && dzien <= dniMiesiaca[miesiac])
                this.dzien = dzien;
            else
                System.out.println("Nie ma takiego dnia");
        }
    }

    private boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public void policzDni(Dzien dzien) {
        int dni = dzien.getDzien();
        for (int i = 0; i < dzien.getMiesiac(); i++) {
            dni += dniMiesiaca[i];
        }
        if (isLeap(dzien.getRok())) {
            dni++;
        }
        System.out.println(String.valueOf(dni));
    }

}
