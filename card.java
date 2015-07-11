class card { 
    private int value;
    private String suit;
    
    public card() {
        value = 0;
        suit = "Armor";
    }
    
    public card(int new_value, String new_suit) {
        value = new_value;
        suit = new_suit;
    }
    public String getCard() {
        return value+"-"+suit.substring(0,1).toUpperCase();
    }
    
    public int getValue() {
        return value;
    }
   
    public static void main(String[] args) {
        card test = new card(3, "Spades");
        System.out.println(test.getCard());
    }
}