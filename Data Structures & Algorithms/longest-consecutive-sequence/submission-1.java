class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if(n == 0 ){
            return 0 ; 
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ;i<n ; i++){
            hs.add(nums[i]);
        }

        int len,ans=1;

        for(Integer element: hs){
            int prevElem = element -1;
            if(!hs.contains(prevElem)){
                len = 1;
                int nextElem = element+1;
                while(hs.contains(nextElem)){
                    len++;
                    nextElem++;
                }
                ans = Math.max(len,ans);
            }
        }
        return ans;

    }
}