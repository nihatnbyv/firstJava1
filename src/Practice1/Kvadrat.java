package Practice1;

public class Kvadrat implements Fiqurlar, Fiqurlar2 {

    private int teref;

    public int getTeref() {
        return teref;
    }

    public void setTeref(int teref) {
        this.teref = teref;
    }

    @Override
    public void test() {

    }

    @Override
    public int sahe(int a, int b) {
        return (a * b);
    }

    @Override
    public int perimetr(int a, int b) {
        return (2 * (a + b));
    }

    @Override
    public int sahe() {
        return teref * teref;
    }

    @Override
    public int perimetr() {
        return 4 * teref;
    }
}
