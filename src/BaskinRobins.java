import java.util.HashMap;
import java.util.Map;

public class BaskinRobins {
    private static final Map<Integer,Integer> map = new HashMap<>();

    static int findCombinations(int num){

        //base-case
        if (num == 0 || num == 1){
            return 1;
        }
        // if there's no key for the current num, place one in the map containing the current recursive call
        if (!map.containsKey(num)) {
            map.put(num, findCombinations(num - 1) + findCombinations(num - 2));
        }
        // return the current recursive call after placing it in the map
        return map.get(num);
    }

    public static void main(String[] args){
        System.out.println("Possible Combinations: " + findCombinations(31));
    }
}
