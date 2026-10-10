import java.util.*;
public class GameView {
    private final Scanner scanner = new Scanner(System.in);
    public int menu() { System.out.println("\\n=== UVG CARD BATTLE ===\\n1. Listar mazo\\n2. Buscar por nombre\\n3. Buscar por ID\\n4. Ordenar por energia\\n5. Ver mano\\n6. Jugar carta\\n7. Tomar carta\\n8. Pasar turno\\n0. Salir"); System.out.print("Opcion: "); return Integer.parseInt(scanner.nextLine()); }
    public String input(String prompt) { System.out.print(prompt); return scanner.nextLine(); }
    public void show(Object value) { System.out.println(value); }
    public void showCards(Iterable<Card> cards) { for (Card c : cards) System.out.println(c); }
}
