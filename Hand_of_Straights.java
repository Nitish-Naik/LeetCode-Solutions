/*
 * 846. Hand of Straights
Solved
Medium
Topics
Companies
Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.

Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.

 

Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
Example 2:

Input: hand = [1,2,3,4,5], groupSize = 4
Output: false
Explanation: Alice's hand can not be rearranged into groups of 4.

 
 */




import java.util.TreeMap;

class Hand_of_Straights {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        
        while (!count.isEmpty()) {
            int first = count.firstKey();
            for (int i = 0; i < W; i++) {
                int next = first + i;
                if (!count.containsKey(next)) return false;
                int freq = count.get(next);
                if (freq == 1) count.remove(next);
                else count.put(next, freq - 1);
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        
    }
}