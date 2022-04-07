class Solution {
    int[] arr;
    public int climbStairs(int n) {
        // arr = new int[n+1];
        // return myFunc(n);
        int one=1,two=1;
        for(int i=0;i<n-1;i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
    
    private int myFunc(int n) {
        if(n==0||n==1) {
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}