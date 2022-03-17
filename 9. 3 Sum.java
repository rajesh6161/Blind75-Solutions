import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// 9. 3 sum
		int nums[] = {-1,0,1,2,-1,-4};
		Arrays.sort(nums);
		System.out.println(threeSum(nums));
	}
	
	static List<List<Integer>> threeSum(int[] nums) {
	    HashSet<List<Integer>> res= new HashSet<>(); // for duplicate list
	    
	    for(int i=0;i<nums.length;i++) {
	        // using two pointers to find other two numbers
	        int l=i+1,r=nums.length-1;
	        while(l<r) {
	            List<Integer> al = new ArrayList<>();
	            int sum = nums[i]+nums[l]+nums[r];
	            if(sum>0) { // simple hai agar sum bada hai toh kam karo
	                r--;
	            } else if(sum<0){
	                l++;
	            } else {
	                al.add(nums[i]);
	                al.add(nums[l]);
	                al.add(nums[r]);
	                l++; // aage badhte rho taaki koi aur dusra number mile and right fix rahega
	                while(nums[l]==nums[l-1] && l<r) l++; // agar numbers repeat ho rhe toh skip krdo
	            }
	            if(al.size()>0) res.add(al);
	        }
	        
	    }
	    return new ArrayList<>(res);
	}
}
