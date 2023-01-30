
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        Iterator<Card> cardIt = cards.iterator();   
        while(cardIt.hasNext())
            System.out.println(cardIt.next());
    }
    
    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand o) {
        return this.cards.stream()
                .mapToInt(v -> v.getValue()
                ).sum() - o.cards.stream()
                .mapToInt(v -> v.getValue()
                ).sum();
    }
}
