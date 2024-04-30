package Lesson12;


public class EmptyBoxExample {
    public static void main(String[] args) {
        String boxContent = getBoxContent();
        if (boxContent != null) {
            System.out.println("Box contains: " + boxContent);
        } else {
            System.out.println("Box is empty.");
        }
    }

    public static String getBoxContent() {
        // Return null to indicate an empty box
        return null;
    }
}
