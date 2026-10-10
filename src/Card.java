import java.util.Objects;

public abstract class Card {
    private final int id;
    private String name;
    private int energyCost;
    private String description;

    protected Card(int id, String name, int energyCost, String description) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.energyCost = energyCost;
        this.description = Objects.requireNonNull(description);
    }
    public abstract String play(GameModel game);
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = Objects.requireNonNull(name); }
    public int getEnergyCost() { return energyCost; }
    public void setEnergyCost(int energyCost) { this.energyCost = Math.max(0, energyCost); }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = Objects.requireNonNull(description); }
    @Override public String toString() { return "[" + id + "] " + name + " | costo=" + energyCost + " | " + description; }
    @Override public boolean equals(Object o) { return o instanceof Card && id == ((Card)o).id; }
    @Override public int hashCode() { return Integer.hashCode(id); }
}
