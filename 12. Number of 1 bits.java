import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// 12. Number of 1 Bits
		int n = 00000000000000000000001000001011;
		
		// 1. Using right shift operator
		/* 
		    n = 1011
		    n%2=1
		    n = n>>1 --> 101
		    n%2=1
		    n = n>>1 --> 10
		    n%2=0
		    n = n>>1 --> 1
		    n%2=1
		*/
		int res = 0;
		while(n!=0) {
		    res += n%2;
		    n = n>>1;
		}
		
		// 2. Inverting bits
		/*
		    int res = 0;
        while(n!=0) {
            n = (n&(n-1));
            res++;
        }
        return res;
		*/
		System.out.println(res);
	}
}
