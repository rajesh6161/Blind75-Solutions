import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    // 13. Counting Bits
	    int n = 5;
	    int dp[] = new int[n+1];
	    dp[0] = 0;
	    int offset = 1; // power of two
	    for(int i=1;i<=n;i++) {
	        if(offset*2==i) offset = i;
	        dp[i] = 1+dp[i-offset];
	    }
	    System.out.println(Arrays.toString(dp));
	}
	
	
}
