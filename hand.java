class hand {
    private card[] cards;
    private int strength = 0;
    
    public hand() {
        
    }
    public hand(card[] starting) {
        cards = starting;
    }
    
    public void discard(card toRemove) {
        
    }
    
    public void show() {
        System.out.println(toString());
    }
    
    public void evaluate() {
        sort();
    }
    
    private void sort() {
        card tempCard;
        for(int i=0;i<cards.length;i++) {
            for(int j = i+1;j<cards.length;j++) {
                if (cards[i].getValue() != 1) {
                    if((cards[j].getValue() > cards[i].getValue()) || (cards[j].getValue()==1)) {
                    tempCard = cards[j];
                    cards[j]=cards[i];
                    cards[i] = tempCard;
                    }
                }
            }
        }
    }
    
    @Override
    public String toString() {
        String value = "";
        for(int i = 0;i<cards.length;i++) {
            value += cards[i].getCard()+" ";
        }
        return value;
    }
    
}