class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1 , n =piles.length , max = 0 ,count = 0 , mid, high  , ans ;
        for (int pile : piles) {
                    max = Math.max(max, pile);
                }
                high = max;
                ans = high;
        while(low <= high){
            mid = low + (high-low)/2;
            count = 0;
            for(int i = 0 ;i<n ;i++){
                if(piles[i]%mid==0){
                    count += piles[i]/mid;
                }else{
                    count += piles[i]/mid;
                    count ++;
                }
            }

            if(count <= h ){
               ans = mid;
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans ;

    }
}
