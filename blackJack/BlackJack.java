package blackJack;
import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");

        // Create the playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        // Create hands for the player and the dealer - hands are created from methods that are made in the deck class
        Deck playerHand = new Deck();
        Deck dealerHand = new Deck();

        double accountBalance = 1000.00;

        // Game loops

        while(accountBalance >= 0){

            //Game init and Bet handling
            System.out.println("Account balance: $" + accountBalance +
                    "\n   Please enter your bet:");
            double bet = Double.parseDouble(scanner.nextLine());
            while(bet > accountBalance) {
                System.out.println("Not enough funds. Enter a diffrent ammount:");
                bet = Double.parseDouble(scanner.nextLine());
            }
            accountBalance -= bet;

            //Drawing hands
            System.out.println("$" + bet + " bet has been made. Remaining balance: $" + accountBalance + "\nStarting game\n-\n-");
            playerHand.draw(playingDeck);
            playerHand.draw(playingDeck);
            dealerHand.draw(playingDeck);
            dealerHand.draw(playingDeck);
            int turn = 0;

            //Round
            while(true){

                //Player print hand
                System.out.println("Current hand:");
                playerHand.printDeck();
                System.out.println("-=> Point total: " + playerHand.deckValue() + " <=-");
                if(playerHand.deckValue() >= 21) break;

                //Dealer print hand
                System.out.println("\nDealer hand:");
                System.out.println(dealerHand.getCard(0).toString());
                System.out.println("**[ HIDDEN CARD ]**");
                System.out.println("-=> Shown points: " + dealerHand.getCard(0).getValue().getValue() + " <=-");

                turn++;
                System.out.println("\nHit or Stand?\n   1) Hit\n   2) Stand");
                int hitOrStand = Integer.parseInt(scanner.nextLine());

                if(hitOrStand == 1) playerHand.draw(playingDeck);
                if(hitOrStand == 2) break;

            }

            System.out.println("\nYour Final Hand:");
            playerHand.printDeck();
            System.out.println("-=> Point total: " + playerHand.deckValue() + " <=-");

            System.out.println("\nDealer Final Draw:");
            dealerHand.printDeck();
            System.out.println("-=> Point total: " + dealerHand.deckValue() + " <=-");

            while(dealerHand.deckValue() < 17){
                dealerHand.draw(playingDeck);
                dealerHand.printDeck();
                System.out.println("-=> Point total: " + dealerHand.deckValue() + " <=-\n");
            }

            boolean houseWins = true;
            if(playerHand.deckValue() == 21 && turn == 0) houseWins = false;
            else if(playerHand.deckValue() > 21) houseWins = true;
            else if(playerHand.deckValue() <= 21 && dealerHand.deckValue() > 21) houseWins = false;
            else if (playerHand.deckValue() > dealerHand.deckValue()) houseWins = false;

            if(houseWins){
                System.out.println("You bust. Dealer wins.");
            } else {
                System.out.println("Dealer bust. You won!");
                accountBalance += (bet * 2);
            }
            if (accountBalance <= 0.0) {
                System.out.println("We took all your money. Try another time.");
                break;
            };

            System.out.println("Continue?\n 1) Yes\n 2) No");
            if (Integer.parseInt(scanner.nextLine()) == 2){
                System.out.println("Your final balance is: " + accountBalance + ". Thanks for playing!");
                break;
            }
            playerHand.moveAllToDeck(playingDeck);
            dealerHand.moveAllToDeck(playingDeck);
            playingDeck.shuffleDeck();
        }
    }
}