package Zajecia0302.CardShuffling;

public enum Figures {
    ACE(0),
    TWO(1),
    THREE(2),
    FOUT(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);

    private int value;
    Figures(int valueI) {
        value = valueI;
    }

    private int getValue() {
        return value;
    }

    public static Figures getValueBasedOnInt(int value) {
        for (Figures figures : Figures.values()) {
            if (figures.getValue() == value) {
                return figures;
            }
        }
        return ACE;
    }
}
