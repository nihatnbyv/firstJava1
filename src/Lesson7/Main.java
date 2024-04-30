package Lesson7;

public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Mario", "Wilson", 1980);
        Human father = new Human("John", "Doe", 1979);
        Pet pet = new Pet("Dog", "Silva", 23, 5, new String[]{"fly"});
        Human daughter = new Human("Natasha", "Doe", 2001, 55, pet, mother, father);
        Human son = new Human("Michael", "Doe", 1999, mother, father);
        Family Pashayev = new Family(father, mother, new Human[5], pet);
        Pashayev.addChild(daughter);
        System.out.println(daughter);
        System.out.println(pet.eat());
        System.out.println(pet.respond());
        System.out.println(pet.foul());
    }
}
