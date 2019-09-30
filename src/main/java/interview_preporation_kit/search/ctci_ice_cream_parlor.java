package interview_preporation_kit.search;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.HashMap;

public class ctci_ice_cream_parlor {
    public static void main(String[] args) {
        int[] costs = {1, 4, 5, 3, 2};
        int money = 4;
        whatFlavors(costs, money);

    }

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < cost.length; i++) {
            if (cost[i] >= money) continue;
            int diff = money - cost[i];
            if(map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + (i+1));
                break;
            } else {
                map.put(cost[i], i+1);
            }
        }
    }
}
