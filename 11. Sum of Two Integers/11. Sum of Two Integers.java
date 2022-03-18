import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    // 11. Sum of Two Integers
		int a = 9;
		int b = 11;
		while(b!=0) {
		    int tmp = (a & b) << 1;
		    a = a ^ b;
		    b = tmp;
		}
		System.out.println(a);
	}
}
