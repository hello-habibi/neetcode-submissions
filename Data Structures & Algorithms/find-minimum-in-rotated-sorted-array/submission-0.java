class Solution {
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int n = nums.length;
        int left = 0,mid ,minPos, right = n-1;

        while(left<=right){
            mid = left+(right-left)/2;
            if(mid<nums.length-1 && nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }
            if(mid >0 && nums[mid] <nums[mid-1]){
                return nums[mid];
            }

            if(nums[mid]>nums[right]){
                left = mid+1;

            }else{
                right = mid-1;
            }
        } 

        return nums[left];



    }
}
