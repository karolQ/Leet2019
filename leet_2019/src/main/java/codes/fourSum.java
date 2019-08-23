package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4) return res;
        Arrays.sort(nums);

        helper(res, nums, new ArrayList<Integer>(), 0, target);
        return res;
    }

    private static void helper(List<List<Integer>> res, int[] nums, List<Integer> list, int pos, int target) {
        if(list.size() == 4) {
            if(list.get(0)+list.get(1)+list.get(2)+list.get(3) == target)
                res.add(new ArrayList<>(list));
            return;
        }
        for(int i = pos; i < nums.length; i++) {
            if(i != pos && nums[i] == nums[i-1]) {
                continue;
            }
            list.add(nums[i]);

            helper(res, nums, list, i+1, target);
            list.remove(list.size() - 1);
        }
    }
}
