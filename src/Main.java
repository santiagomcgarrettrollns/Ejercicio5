public class Main {
    public static void main(String[] args) {
        GameModel model = new GameModel();
        model.getDeck().add(new ProfessorCard(1,"Dra. Garcia",3,"Experta en POO","Computacion",2,4));
        model.getDeck().add(new ProfessorCard(2,"Ing. Lopez",2,"Catedratico auxiliar","Computacion",1,3));
        model.getDeck().add(new CourseCard(3,"Programacion Orientada a Objetos",4,"Curso fundamental",4,5));
        model.getDeck().add(new CourseCard(4,"Estructuras de Datos",3,"Curso de algoritmos",4,4));
        model.getDeck().add(new CourseCard(5,"Bases de Datos",2,"Modelado relacional",3,3));
        model.getDeck().add(new CourseCard(6,"Calculo II",5,"Curso exigente",4,5));
        model.getDeck().add(new CampusEventCard(7,"Semana de Parciales",4,"Aumenta la presion academica","Todos estudian",-3));
        model.getDeck().add(new CampusEventCard(8,"Feria de Clubes",1,"Recuperas energia","Motivacion estudiantil",3));
        model.getDeck().add(new CampusEventCard(9,"Asamblea Universitaria",2,"Actividad institucional","Organizacion",1));
        model.getDeck().add(new CampusEventCard(10,"Dia sin Clases",0,"Descanso inesperado","Descanso",5));
        for (int i = 0; i < 3; i++) model.drawCard();
        new GameController(model, new GameView()).run();
    }
}
