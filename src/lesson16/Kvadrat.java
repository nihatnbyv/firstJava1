package lesson16;

public class Kvadrat implements Shape {

    private int teref;

    public Kvadrat (int a) {
        this.teref = a;
    }

    @Override
    public int sahe() {
        return teref * teref;
    }

    @Override
    public int perimetr() {
        return 4 * teref;
    }

    public int getTeref() {
        return teref;
    }

    public void setTeref(int teref) {
        this.teref = teref;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "teref=" + teref +
                '}';
    }
}
