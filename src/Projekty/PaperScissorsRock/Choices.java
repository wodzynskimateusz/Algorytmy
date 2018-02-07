package Projekty.PaperScissorsRock;

public enum Choices {

    ROCK(0,"k"), SCISSORS(1,"n"), PAPER(2,"p");

    private int value;
    private String letter;

    Choices (int value, String letter){
        this.value = value;
        this.letter = letter;
    }

    public int getValue(){
        return value;
    }
    public String getLetter() {
        return letter;
    }

    public static Choices getEnumInt(int x){
        for (Choices choice : Choices.values()) {
            if(choice.getValue() == x)
                return choice;
        }
        return ROCK;
    }
    public static Choices getEnumString(String z){
        for (Choices choice : Choices.values()) {
            if(choice.getLetter().equals(z))
                return choice;
        }
        return ROCK;
    }
}
