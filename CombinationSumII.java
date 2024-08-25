import java.util.*;
public class CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void findCombinations(int idx, int candidates[], int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target < 0) return;
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx; i < candidates.length; i++) {
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            ds.add(candidates[i]);
            findCombinations(idx+1, candidates, target-candidates[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }
}