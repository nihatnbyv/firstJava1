package Pratice;

public class Masin extends Usta implements Drive {
    private String model;
    private int speed;
    private int wheel;
    private boolean avtomat;

    public Masin(String model, int speed, int wheel, boolean avtomat) {
        this.model = model;
        this.speed = speed;
        this.wheel = wheel;
        this.avtomat = avtomat;
    }

//    public Masin() {
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        if (wheel <= 4) {
            this.wheel = wheel;
        }else {
            this.wheel = 4;
        }
    }

    public boolean isAvtomat() {
        return avtomat;
    }

    public void setAvtomat(boolean avtomat) {
        this.avtomat = avtomat;
    }


    @Override
    public String toString() {
        return "Masin{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", wheel=" + wheel +
                ", avtomat=" + avtomat +
                '}';
    }


    @Override
    public void start() {
        System.out.println("Maşın yola düzəldi.");
    }

    @Override
    public void stop() {
        System.out.println( this.model + " maşını dayandı.");
    }
}
