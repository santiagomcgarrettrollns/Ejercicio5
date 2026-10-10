public class GameModel {
    private final DeckModel deck = new DeckModel();
    private final java.util.List<Card> hand = new java.util.ArrayList<>();
    private int energy = 10, credits = 0, score = 0;
    public DeckModel getDeck() { return deck; }
    public java.util.List<Card> getHand() { return java.util.Collections.unmodifiableList(hand); }
    public Card drawCard() { Card card = deck.drawCard(); if (card != null) hand.add(card); return card; }
    public Card findInHand(int id) { for (Card card : hand) if (card.getId() == id) return card; return null; }
    public int getEnergy() { return energy; }
    public int getCredits() { return credits; }
    public int getScore() { return score; }
    public void addEnergy(int amount) { energy = Math.max(0, energy + amount); }
    public void addCredits(int amount) { credits += amount; }
    public void addScore(int amount) { score += amount; }
    public String play(Card card) { if (card == null) return "Carta no encontrada."; if (!hand.contains(card)) return "La carta no esta en tu mano."; if (energy < card.getEnergyCost()) return "No tienes energia suficiente."; energy -= card.getEnergyCost(); hand.remove(card); return card.play(this); }
}
