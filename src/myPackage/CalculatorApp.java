package myPackage;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Emeliyyati secin:"
                + "\n , 1.Topla"
                + "\n , 2.Cixma"
                + "\n , 3.Vurma"
                + "\n , 4.Bolme"
        );
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        if (menu== 1){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            toplama(num1 , num2);
        } else if (menu== 2) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            cixma(num1 , num2);
        } else if (menu== 3) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            vurma(num1, num2);
        } else if (menu==4) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            bolme(num1, num2);
        }else {
            System.out.println("Movcud deyil");
        }
    }
    public static void toplama (int a, int b){

        System.out.println(a+b);
    }

    public static void cixma (int a, int b){
        int ferq = a-b;
        System.out.println(ferq);
    }

    public static int vurma (int a, int b){
        int hasil = a*b;
        System.out.println(hasil);
        return hasil;
    }

    public static void bolme (int a, int b){
        int bolunme = a/b;
        System.out.println(bolunme);
    }
}
