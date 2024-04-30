package Practice1;

public class Main {
    public static void main(String[] args) {
        Kvadrat kv = new Kvadrat();
        int kvSahe = kv.sahe(10,10);
        int kvPer = kv.perimetr(10,10);

        Duzbucaqli db = new Duzbucaqli();
        db.setEn(5);
        db.setUzunluq(15);
        int dbSahe = db.sahe();
        int dbPer = db.perimetr();
        System.out.println(dbSahe + " " + dbPer);
    }
}
