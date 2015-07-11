class card { 
    private int value;
    private String suit;
    
    public card(int new_value, String new_suit) {
        value = new_value;
        suit = new_suit;
    }
    public String get_card() {
        return value+"-"+suit.substring(0,1).toUpperCase();
    }
    
    public static void main(String[] args) {
        card test = new card(3, "Spades");
        System.out.println(test.get_card());
    }
}