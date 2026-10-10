public class ProfessorCard extends Card {
    private final String department;
    private int warnings;
    private int attentionTime;
    public ProfessorCard(int id, String name, int cost, String description, String department, int warnings, int attentionTime) {
        super(id, name, cost, description); this.department = department; this.warnings = warnings; this.attentionTime = attentionTime;
    }
    @Override public String play(GameModel game) { game.addScore(attentionTime); return "El catedratico genera " + attentionTime + " puntos de atencion."; }
    @Override public String toString() { return "CATEDRATICO " + super.toString() + " | depto=" + department + " | llamadas=" + warnings + " | tiempo=" + attentionTime; }
}
