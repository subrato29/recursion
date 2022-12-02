import java.util.ArrayList;
import java.util.Collections;

public class NumSubseq {
    public int numSubseq(int[] nums, int target) {
        return helper (nums, target, 0, new ArrayList<Integer>(), 0);
    }

    public int helper (int[] nums, int target, int index, ArrayList<Integer> seq, int counter) {
        if (index == nums.length) {
            if (seq.size() > 0 && sumOfMinMax (seq) <= target) {
                System.out.println(seq);
                counter++;
            }
            return counter;
        }
        seq.add (nums[index]);
        counter = helper (nums, target, index + 1, seq, counter);
        seq.remove (Integer.valueOf(nums[index]));
        counter = helper (nums, target, index + 1, seq, counter);
        return counter;
    }

    public int sumOfMinMax (ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size () == 1) {
            return list.get (0);
        }
        Collections.sort (list);
        return list.get (0) + list.get (list.size () - 1);
    }

    public static void main (String[] args) {
        NumSubseq obj = new NumSubseq();
        int[] arr = {3,5,6,7};
        System.out.println(obj.numSubseq (arr, 9));
    }

}
