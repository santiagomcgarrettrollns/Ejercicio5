public class CampusEventCard extends Card {
    private final String effect;
    private final int energyChange;
    public CampusEventCard(int id, String name, int cost, String description, String effect, int energyChange) {
        super(id, name, cost, description); this.effect = effect; this.energyChange = energyChange;
    }
    @Override public String play(GameModel game) { game.addEnergy(energyChange); return "Evento: " + effect + " (energia " + (energyChange >= 0 ? "+" : "") + energyChange + ")."; }
    @Override public String toString() { return "EVENTO " + super.toString() + " | efecto=" + effect; }
}
