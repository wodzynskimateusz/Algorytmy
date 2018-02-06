package Projekty.Ships;

public class Ship {

    private int shipsNumber;
    private int mastsNumber;

    public Ship(int iloscStatkow, int iloscMasztow){
        this.shipsNumber = iloscStatkow;
        this.mastsNumber = iloscMasztow;
    }

    public int getShipsNumber() {
        return shipsNumber;
    }

    public int getMastsNumber() {
        return mastsNumber;
    }
}
