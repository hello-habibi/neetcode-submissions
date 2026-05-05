class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int zeros = 0 ;
        int m=1;
        int pos = -1;
        int[] result = new int[n];

        for(int i = 0 ; i<n ; i++){
            if(nums[i] == 0){
                zeros ++;
                pos = i;
            }else{
                m *= nums[i];
            }
            result[i] = 0 ;
           
        }

        if(zeros>1){

            return result;
        }

        if(zeros == 1 ){
            result[pos] = m;
            return result;
        }

        for(int i = 0 ; i< n ;i++){
            result[i] = m/nums[i];
        }
        return result ;

        
    }
}  
