import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Hashmap to see the hero name easily
public class Leaderboard {
    private HashMap<String, Integer> scores = new HashMap<>();

    public void addScore(String name, int score) {
        scores.put(name, score);
    }

    public int getScore(String name) {
        return scores.getOrDefault(name, 0);
    }

    public void printLeaderboard() {
        ArrayList<String> names = new ArrayList<>(scores.keySet());
        Collections.sort(names, (a, b) -> scores.get(b) - scores.get(a));
        System.out.println("===========================");
        System.out.println("|      LEADERBOARD        |");
        System.out.println("===========================");
        int rank = 1;
        for (String name : names) {
            System.out.println(rank + name + " -> " + scores.get(name));
            rank++;
        }
        System.out.println("==========================");
    }
}