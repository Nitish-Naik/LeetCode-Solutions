import java.util.*;
public class LargestNumber {
    public static String largestNumber(int[] nums) {
        List<String> strNum = new ArrayList<>();
        for(int i : nums) {
            strNum.add(String.valueOf(i));
        }

        strNum.sort((str1, str2) -> (str2+str1).compareTo(str1+str2));

        if("0".equals(strNum.get(0))) {
            return "0";
        }

        return String.join("", strNum);
    }

    public static void main(String[] args) {
        int nums[] = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
        
        
    }
}

