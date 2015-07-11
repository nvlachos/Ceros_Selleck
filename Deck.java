import java.util.Random;
class deck {

    private card[] dek = new card[52];
    private String[] suits = new String[] {"Clubs","Diamonds","Hearts","Spades"};
    private int remaining = 52;
    private int deckIndex = 0;
    
    public deck() {
        int index = 0;
        for(int i=0;i<4;i++) {
            for (int j=1;j<14;j++) {
                dek[index] = new card(j,suits[i]);
                index++;
            }
        }
        shuffle(3);
    }
    
    public void shuffle(int times) {
        Random shuffler = new Random();
        while (times > 0) {
            for(int i=dek.length-1;i>0;i--) {
                int randomCardNumber = shuffler.nextInt(52);
                card temp = dek[randomCardNumber];
                dek[randomCardNumber] = dek[i];
                dek[i] = temp;
            }
            times--;
        }
    }
    
    public void printDeck() {
        for(int i=0;i<dek.length;i++) {
            System.out.println(dek[i].getCard());
        }
    }
    
    public card[] deal(int numberOfCards) {
        if(numberOfCards>remaining) {
            System.out.println("Too many cards requested");
            return null;
        }
        card[] freshcards = new card[numberOfCards];
        for(int i=0;i<numberOfCards;i++) {
            freshcards[i]=dek[deckIndex];
            deckIndex++;
            remaining--;
        }
        return freshcards;
    }
 
}