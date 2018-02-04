package Zajecia0302.CardShuffling;

public class Card {
    Colors color;
    Figures figures;

    public Card(Colors color, Figures figures) {
        this.color = color;
        this.figures = figures;
    }

    public Colors getColors() {
        return color;
    }

    public Figures getFigures() {
        return figures;
    }

    @Override
    public String toString() {
        return color.name() + " " + figures.name();
    }
}
