public class Single_Number_III {
    
    public static int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers to get the XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        // Step 2: Find a set bit (rightmost set bit)
        int setBit = xor & -xor;
        
        // Step 3: Partition the array into two groups and XOR each group
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & setBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        // Step 4: Return the two unique numbers
        return new int[] { num1, num2 };
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = singleNumber(nums);
        System.out.println("The two unique numbers are: " + result[0] + " and " + result[1]);
    }
}
