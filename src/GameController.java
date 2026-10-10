public class GameController {
    private final GameModel model; private final GameView view;
    public GameController(GameModel model, GameView view) { this.model = model; this.view = view; }
    public void run() { boolean running = true; while (running) { try { switch (view.menu()) {
        case 1 -> view.showCards(model.getDeck().getCards());
        case 2 -> { Card c=model.getDeck().find(view.input("Nombre: ")); view.show(c == null ? "No encontrada." : c); }
        case 3 -> { Card c=model.getDeck().find(Integer.parseInt(view.input("ID: "))); view.show(c == null ? "No encontrada." : c); }
        case 4 -> view.showCards(model.getDeck().sortedByEnergy());
        case 5 -> view.showCards(model.getHand());
        case 6 -> { Card c=model.findInHand(Integer.parseInt(view.input("ID de la carta: "))); view.show(model.play(c)); }
        case 7 -> { Card c=model.drawCard(); view.show(c == null ? "El mazo esta vacio." : "Robaste: " + c); }
        case 8 -> { model.addEnergy(2); view.show("Pasas el turno. +2 energia."); }
        case 0 -> running=false;
        default -> view.show("Opcion invalida."); }
        view.show("Estado: energia="+model.getEnergy()+", creditos="+model.getCredits()+", puntos="+model.getScore());
    } catch (NumberFormatException e) { view.show("Ingresa un numero valido."); } } }
}
