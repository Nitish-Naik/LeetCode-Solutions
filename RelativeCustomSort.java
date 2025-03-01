package JUNE_2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RelativeCustomSort {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Create a map to store the index of each element in arr2
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        
        // Custom sorting using the map
        Integer[] arr1Integer = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1Integer[i] = arr1[i];
        }
        Arrays.sort(arr1Integer, (a, b) -> {
            // If both elements are in arr2, compare their indices in arr2
            if (map.containsKey(a) && map.containsKey(b)) {
                return map.get(a) - map.get(b);
            }
            // If only one element is in arr2, prioritize it
            else if (map.containsKey(a)) {
                return -1;
            } else if (map.containsKey(b)) {
                return 1;
            }
            // If neither element is in arr2, maintain their relative order
            else {
                return a - b;
            }
        });
        
        // Convert Integer array back to int array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1Integer[i];
        }
        
        return arr1;
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));  // Output: [2,2,2,1,4,3,3,9,6,7,19]
    }
}
