package interview_preporation_kit.sorting_comparator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score < b.score) return 1;
        else if (a.score > b.score) return -1;
        else {
            int res = a.name.compareTo(b.name);
            if (res > 0) return 1;
            else if(res < 0) return -1;
            else return 0;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            players[i] = new Player(scanner.next(), scanner.nextInt());
        }
        scanner.close();

        Arrays.sort(players, checker);

        for (int i = 0; i < players.length; i++){
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }

}
