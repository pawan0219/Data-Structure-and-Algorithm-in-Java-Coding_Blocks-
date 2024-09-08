import java.util.*;
public class Combination_sum {
    public static void main(String[] args) {
        int[] coin = {2, 3, 6, 7};
        int amount  = 7;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(coin, amount, ll, ans, 0);
        System.out.println(ans);
    }
    public static void Combination(int[] coin, int amount, List<Integer> ll, List<List<Integer>> ans, int idx){
        if (amount == 0) {
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                // amount -= coin[i];
                ll.add(coin[i]);
                Combination(coin, amount - coin[i], ll, ans, i);
                ll.remove(ll.size() - 1);
                // amount += coin[i];
            }
        }
    }
}
