package codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _349_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        if(nums1.length == 0 || nums2.length == 0)
            return new int[]{};
        Set<Integer> rs = new HashSet<>();
        Arrays.sort(nums1);
        for(int n : nums2) {
            int low = 0, high = nums1.length-1;
            while(low + 1 < high) {
                int mid = low + (high - low) / 2;
                if(n == nums1[mid]){
                    rs.add(n);
                }
                else if(n < nums1[mid])
                    high = mid;
                else
                    low = mid;
            }
            if(nums1[low] == n) rs.add(n);
            if(nums1[high] == n) rs.add(n);
        }

        int k = 0;
        int[] res = new int[rs.size()];
        for(int n : rs) {
            res[k++] = n;
        }
        return res;
    }
}
