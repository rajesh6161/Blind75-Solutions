import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    // 1. Two Sum
	    int nums[] = {3,2,4};
	    int target = 7;
	    int res[] = new int[2];
	    
	  int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])) {
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }
            map.put(nums[i], i);
        }
	    System.out.println(Arrays.toString(res));
	}
}
