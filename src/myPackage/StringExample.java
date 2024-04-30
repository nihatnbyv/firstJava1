package myPackage;

public class StringExample {


    //              İMMUTABLE CLASS
    public static void main(String[] args) {
        String originalString = "Hello";
        String modifiedString = originalString.concat(", World!"); // Yeni bir string oluşturulur ve değişkene atanır


        String a ="Nihat";
        a = "Nabiyev";
        System.out.println("Original String: " + originalString); // Çıktı: Original String: Hello
        System.out.println("Modified String: " + modifiedString); // Çıktı: Modified String: Hello, World!
        System.out.println(a);
    }


//                MUTABLE CLASS

//    public static void main(String[] args) {
//        StringBuilder mutableString = new StringBuilder("Hello");
//        System.out.println("Original String: " + mutableString); // Çıktı: Original String: Hello
//
//        // StringBuilder nesnesini değiştir
//        mutableString.append(", World!");
//        System.out.println("Modified String: " + mutableString); // Çıktı: Modified String: Hello, World!
//
//        // StringBuilder nesnesini daha fazla değiştir
//        mutableString.replace(0, 5, "Hi");
//        System.out.println("Replaced String: " + mutableString); // Çıktı: Replaced String: Hi, World!
//    }


}
