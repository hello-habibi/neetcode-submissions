class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];
        int first =0 , second=numbers.length-1 ; 
        while(first<second){
            if((numbers[first]+numbers[second]) == target){
                ans[0] = first+1;
                ans[1]=second+1;
                break;
            }else if((numbers[first]+numbers[second]) < target){
                first ++;
            }else{
                second--;
            }
        }
        
        return ans;
    }
}
