package Lesson13;

public class Futbolcu extends Sportsmen implements Shoot{

    Position position;

    public Futbolcu(String name, String surname, int year, Position position) {
        super(name, surname, year);
        this.position = position;
    }

    @Override
    public String goal() {
        return "GOOOOOOOOOOOOOOOOOAAAAAAAAAAALLLLLLLL";
    }

    @Override
    public String noGoal() {
        return "NO GOAL !";
    }
}