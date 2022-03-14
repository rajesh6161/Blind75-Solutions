import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// 2. Best time to buy and sell stocks
		int prices[] = {7,1,5,3,6,4};
		int l=0;
		int r=1;
		
		int maxProfit=0;
		
		while(r<prices.length) {
		    if(prices[l]<prices[r]) {
		        maxProfit = Math.max(maxProfit, prices[r]-prices[l]);
		    } else {
		        l=r;
		    }
		    r++;
		}
		System.out.println(maxProfit);
	}
}
