package lesson24;

public class Player implements Comparable<Player>{
    private String name;
    private Integer score;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{name='%s', score=%d}".formatted(name, score);
    }

    @Override
    public int compareTo(Player that) {
        if (!this.score.equals(that.score)) {
            return Integer.compare(that.score, this.score);
        }else {
            return this.name.compareTo(that.name);
        }
    }
}
