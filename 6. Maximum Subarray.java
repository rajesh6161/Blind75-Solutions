import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int x = maxSubArray(nums);
		System.out.println(x);
	}
	static int maxSubArray(int[] nums) {
	    int currSum = 0;
	    int maxSum = nums[0];
	    
	    for(int i=0;i<nums.length;i++) {
	        if(currSum<0) currSum = 0;
	        currSum += nums[i];
	        maxSum = Math.max(currSum, maxSum);
	    }
	    return maxSum;
	}
	
}
