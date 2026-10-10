import java.util.*;

public class DeckModel {
    private final List<Card> cards = new ArrayList<>();
    public void add(Card card) { cards.add(Objects.requireNonNull(card)); }
    public List<Card> getCards() { return Collections.unmodifiableList(cards); }
    public Card drawCard() { return cards.isEmpty() ? null : cards.remove(0); }
    public List<Card> sortedByEnergy() { List<Card> result = new ArrayList<>(cards); result.sort(Comparator.comparingInt(Card::getEnergyCost)); return result; }
    public Card find(String name) { for (Card c : cards) if (c.getName().equalsIgnoreCase(name)) return c; return null; }
    public Card find(int id) { for (Card c : cards) if (c.getId() == id) return c; return null; }
}
