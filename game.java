class game {
    
    private hand[] players;
    
    public static void main(String[] args) {
        int players = 6;
        game draw = new game(players);
    }
    
    public game(int numOfPlayers) {
        deck dek = new deck();
        players = new hand[numOfPlayers];
        for(int i=0; i<numOfPlayers; i++) {
            players[i] = new hand(dek.deal(5));
            players[i].evaluate();
        }
        show(players);
    }

    public void show(hand[] hands) {
        for(int i=0; i<players.length; i++) {
            System.out.print("Player: "+(i+1)+" has: ");
            hands[i].show();
        }
    }

    public void evaluate(hand goodHand) {

    }
}