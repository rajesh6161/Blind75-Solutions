import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int nums[] = {5,7,2,8}; // [24,12,8,6]
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
	static int[] productExceptSelf(int[] nums) {
	    int n = nums.length;
	    int res[] = new int[n];
	    
	    int left_p[] = new int[n];
	    int right_p[] = new int[n];
	    left_p[0] = 1;
	    right_p[n-1] = 1;
	    
	    for(int i=1;i<n;i++) {
	        left_p[i] = left_p[i-1]*nums[i-1];
	    }
	    
	    for(int i=n-2;i>=0;i--) {
	        right_p[i] = right_p[i+1]*nums[i+1];
	    }
	    
	    for(int i=0;i<n;i++){
	        res[i]=left_p[i]*right_p[i];
	    }
	    return res;
	}
}
