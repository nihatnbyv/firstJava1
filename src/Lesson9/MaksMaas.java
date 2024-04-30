package Lesson9;

import java.util.Scanner;

public class MaksMaas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maxSalary = -1;
        double salary;

        while (sc.hasNext()) {
            salary = sc.nextDouble();
            if (maxSalary < salary)
                maxSalary = salary;
        }
        System.out.print(maxSalary);
    }
}