import java.util.*;

class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(candidates, target, result, ds, 0);
        return result;
    }

    private static void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            helper(candidates, target - candidates[index], ans, ds, index);
            ds.remove(ds.size() - 1);
        }

        helper(candidates, target, ans, ds, index + 1);
    }

    public static void main(String[] args) {
        int candidates[] = {2, 3, 6, 7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }
}
