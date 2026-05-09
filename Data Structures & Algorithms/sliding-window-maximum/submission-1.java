class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length , m , maxi =-1;

        if(k==n){
            m = 1; 
        }else{
            m=n-k+1;
        }
        int[] ans = new int[m];

        for(int i = 0 ; i< k ;i++){
            maxi =Math.max(maxi,nums[i]);
        }
        ans[0] = maxi;
        for(int i = 1 ;i <= n-k ;i++){
            maxi = Integer.MIN_VALUE;

        for(int j = 0 ; j<k ;j++){
            maxi = Math.max(maxi,nums[i+j]);
        }
        ans[i] =maxi;
        }
        return ans;
    }
}
