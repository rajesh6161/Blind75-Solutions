import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// 7. Find Minimum in Rotated Sorted Array
		int nums[] = {3,4,5,1,2};
		int x = findMin(nums);
		System.out.println(x);
	}

	static int findMin(int[] nums) {
	    int l=0,r=nums.length-1;
	    int res = nums[0];
	    
	    while(l<=r) {
	        if(nums[l]<nums[r]) {
	            res = Math.min(res, nums[l]);
	            break;
	        }
	        int m = l+(r-l)/2;
	        res = Math.min(res, nums[m]);
	        if(nums[m]>=nums[l]) {
	            l = m+1;
	        } else {
	            r = m-1;
	        }
	    }
	    return res;
	}
}
