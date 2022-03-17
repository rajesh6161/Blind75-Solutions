import java.util.*;

public class Main
{
	public static void main(String[] args) {
		// 9. Container With Most Water
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	/*
	Its a very simple problem. Make two pointers left and right. why? because we want to find max area, and area 
	is height*width so max area will be found when we have maximum height and width. In first place we are
	using maximum width that's why left and right pointers are used. 
	
	Now, the area will depend on height and height is our bottleneck as minimum height will be considered
	because if right height is larger than left height then overflow will occur so only consider the minimum
	height and keep looking for height that might be larger than the previous height that's it.
	
	*/
	static int maxArea(int[] height) {
	    int l=0;
	    int r=height.length-1;
	    int area = 0;
	    while(l<r) {
	        int h = Math.min(height[l],height[r]);
	        area = Math.max(area, (r-l)*h);
	        if(height[l]<height[r]) {
	            l++;
	        } else {
	            r--;
	        }
	        
	    }
	    return area;
	}
}
