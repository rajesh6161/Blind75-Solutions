import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// 8. Search in Rotated Sorted Array
		int nums[] = {3,4,5,1,2};
		int target = 3;
		int x = search(nums, target);
		System.out.println(x);
	}

	static int search(int[] nums, int target) {
	    int l=0,r=nums.length-1;
	    
	    while(l<=r) {
	        int m = l+(r-l)/2;
	        if(nums[m]==target) return m;
	        if(nums[l]<=nums[m]) {
	            if(target>nums[m] || target<nums[l]) {
	                l = m+1;
	            } else {
	                r = m-1;
	            }
	        } else {
	            if(target<nums[m] || target>nums[r]) {
	                r = m-1;
	            } else {
	                l = m+1;
	            }
	        }
	    }
	    return -1;
	}
}
