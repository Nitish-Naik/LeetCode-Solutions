import java.util.*;

class Leetcode_1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for(String word : words) {
            boolean isConsistent = true;

            for(char ch : word.toCharArray()){
                if(!set.contains(ch)) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) {
                count++;
            }
        }
    return count;
    }
    public static void main(String[] args) {
        String a[] = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings("cad", a));
    }
}