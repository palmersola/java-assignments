package blackJack;

public enum Suits {
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades"),
    CLUB("Clubs");

    public final String label;

    Suits(String label){
        this.label = label;
    }

    public String returnSuit(){
        return this.label;
    }


}