package lesson16;

public class Duzbucaqli implements Shape {


    private int en;
    private int uzunluq;

    public Duzbucaqli(int en, int uzunluq) {
        this.en = en;
        this.uzunluq = uzunluq;
    }

    @Override
    public int sahe() {
        return (en * uzunluq);
    }

    @Override
    public int perimetr() {
        return (2 * (this.en + this.uzunluq));
    }
    public int getUzunluq() {
        return uzunluq;
    }

    public void setUzunluq(int uzunluq) {
        this.uzunluq = uzunluq;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "Duzbucaqli{" +
                "en=" + en +
                ", uzunluq=" + uzunluq +
                '}';
    }
}
