package Lesson14;

public class Book implements IBook {
    private String ad;
    private String muellif;
    private Status status;


    @Override
    public void borrowBook() {
        if (this.getStatus().equals(Status.AVAIBLE)) {
            this.setStatus(Status.BORROWED);
        } else
            throw new CustomException("Bu kitab yoxdur.");
    }

    @Override
    public void returnBook() {
        this.setStatus(Status.AVAIBLE);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ad='" + ad + '\'' +
                ", muellif='" + muellif + '\'' +
                ", status=" + status +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMuellif() {
        return muellif;
    }

    public void setMuellif(String muellif) {
        this.muellif = muellif;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book(String ad, String muellif, Status status) {
        this.ad = ad;
        this.muellif = muellif;
        this.status = status;
    }
}
