package lesson24;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] players = {new Player("Nihat", 25),
                new Player("Hesen", 15),
                new Player("Hesen", 25)};
        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

        System.out.println("======================");
        Arrays.sort(players, new PlayerScoreAscComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("======================");
        Arrays.sort(players, new PlayerNameDescComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("======================");
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println(Arrays.toString(players));

        System.out.println("======================");

        Arrays.sort(players, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(Arrays.toString(players));
    }
}
