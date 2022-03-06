import java.util.HashMap;

public class Blackjack {
    public static int bjNum = 21;
    public String card1, card2;

    public int parseCard(String card) {
        HashMap<String, Integer> mapping = new HashMap<>();
        mapping.put("ace", 11);
        mapping.put("two", 2);
        mapping.put("three", 3);
        mapping.put("four", 4);
        mapping.put("five", 5);
        mapping.put("six", 6);
        mapping.put("seven", 7);
        mapping.put("eight", 8);
        mapping.put("nine", 9);
        mapping.put("ten", 10);
        mapping.put("jack", 10);
        mapping.put("queen", 10);
        mapping.put("king", 10);
        mapping.put("other", 0);

        return mapping.get(card);
        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.parseCard method");
    }

    public boolean isBlackjack(String card1, String card2) {
        return this.parseCard(card1) + this.parseCard(card2) == this.bjNum;
        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.isBlackjack method");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (this.card1.equals("ace") && this.card2.equals("ace")) {
            return "P";
        }
        if (isBlackjack && (dealerScore != 11 && dealerScore != 10)) {
            return "W";
        } else {
            return "S";
        }
        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (handScore >= 12 && handScore <= 16) {
            return dealerScore >= 7 ? "H" : "S";
        } else {
            return "W";
        }
        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the
    // cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls
    // the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        this.card1 = card1;
        this.card2 = card2;

        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
