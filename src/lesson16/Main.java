package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape duzbucaqli = new Duzbucaqli(5, 7);
        Shape kvadrat = new Kvadrat(8);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(duzbucaqli);
        shapes.add(kvadrat);

        System.out.println(Arrays.toString(new List[]{shapes}));
        System.out.println(duzbucaqli.perimetr());
        System.out.println(duzbucaqli.sahe());
        System.out.println(kvadrat.perimetr());
        System.out.println(kvadrat.sahe());
    }

}
