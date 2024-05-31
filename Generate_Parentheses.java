import java.util.*;

public class Generate_Parentheses {
    public static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        helper(n, 0, 0, "", result);
        return result;
    }

    public static void helper(int n, int o, int c, String ans, List<String> result) {
        if(ans.length() == 2*n){
            result.add(ans);
            return;
        }

        if(o < n) {
            helper(n, o+1, c, ans.concat("("), result);
        }
        if(c < o) {
            helper(n, o, c+1, ans.concat(")"), result);
        }
    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }    
}