public class CourseCard extends Card {
    private final int credits;
    private final int difficulty;
    public CourseCard(int id, String name, int cost, String description, int credits, int difficulty) {
        super(id, name, cost, description); this.credits = credits; this.difficulty = difficulty;
    }
    @Override public String play(GameModel game) { game.addCredits(credits); return "Curso aprobado: +" + credits + " creditos (dificultad " + difficulty + ")."; }
    @Override public String toString() { return "CURSO " + super.toString() + " | creditos=" + credits + " | dificultad=" + difficulty; }
}
