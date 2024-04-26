import java.util.*;
public class Kids_With_the_Greatest_Number_of_Candies_1431 
{

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = findMax(candies);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    static int findMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
    
