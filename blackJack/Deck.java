package blackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public void createFullDeck() {
        deck = new ArrayList<Card>();
        for (Suits suit: Suits.values()){
            for(Values value: Values.values()){
                deck.add(new Card(suit, value));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }



    public Card getCard(int i){
        return this.deck.get(i);
    }

    public void removeCard(int i){
        this.deck.remove(i);
    }

    public void addCard(Card addCard) {
        this.deck.add(addCard);
    }

    // Get the size of the deck
    public int deckSize() {
        return this.deck.size();
    }

    // Draws from the deck
    public void draw(Deck playingDeck) {
        Card newCard = playingDeck.getCard(0);
        playingDeck.removeCard(0);
        this.addCard(newCard);

    }

    public void printDeck() {
        for(int i = 0; i < this.deckSize(); i++){
            System.out.println(this.getCard(i).toString());
        }
    }

    public int deckValue() {
        int total = 0;
        for (int i = 0; i < this.deck.size(); i++) {
            total += this.getCard(i).getValue().getValue();
        }
            return total;
    }

    // This will move cards back into the deck to continue playing
    public void moveAllToDeck(Deck targetDeck) {
        int deckSize = this.deck.size();
        for(int i = 0; i < deckSize; i++){
            targetDeck.addCard(this.getCard(i));
        }
        System.out.println(targetDeck.deck.size());
        for(int i = 0; i < deckSize; i++){
            this.removeCard(0);
        }
        System.out.println(this.deck.size());

    }


}