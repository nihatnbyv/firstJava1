package Practice1;

public class Duzbucaqli implements Fiqurlar, Fiqurlar2 {

    private int en;
    private int uzunluq;

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getUzunluq() {
        return uzunluq;
    }

    public void setUzunluq(int uzunluq) {
        this.uzunluq = uzunluq;
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
        return en * uzunluq;
    }

    @Override
    public int perimetr() {
        return 2 * (en + uzunluq);
    }
}
