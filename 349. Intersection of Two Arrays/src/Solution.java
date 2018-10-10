import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num1:nums1) {
            for (int num2:nums2) {
                if (num1 == num2) {
                    set.add(num1);
                }
            }
        }
        int[] ints = new int[set.size()];
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        for (int i = 0; i < set.size(); i++) {
            ints[i] = arrayList.get(i);
        }
        return ints;

    }
}