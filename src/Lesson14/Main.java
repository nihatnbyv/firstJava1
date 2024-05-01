package Lesson14;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Əlifba sırası ilə qətl", "Aqata", Status.AVAIBLE);
        System.out.println(book);
        book.borrowBook();
        System.out.println(book);
        book.returnBook();
        System.out.println(book);
    }
}
