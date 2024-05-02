import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class Largest_Positive_Integer_That_Exists_With_Its_Negative
{
    public static void main(String[] args) 
    {
        int nums[] = {-10,8,-7,7,-2,-3};
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
 
        }

        for(int num: nums)
        {
            if(num > 0 && set.contains(-num))
            {
                max = Math.max(max, num);
            }
        }
        System.out.println(max);
    }
}