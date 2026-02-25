import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;   // found a duplicate
            }
            seen.add(num);
        }

        return false;  // all elements were distinct
    }
}