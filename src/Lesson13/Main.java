package Lesson13;

public class Main {
    public static void main(String[] args) {
        Futbolcu futbolcu = new Futbolcu("David", "Beckham", 25, Position.MIDFIELDER);

        futbolcu.goal();

        System.out.println(futbolcu.goal());

        if (futbolcu instanceof Sportsmen) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
