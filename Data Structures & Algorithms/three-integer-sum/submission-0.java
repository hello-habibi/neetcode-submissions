
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> finalAns = new ArrayList<>();

        for(int i = 0; i < n; i++){

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            if(nums[i] > 0) break;

            int target = -nums[i];
            int start = i + 1, end = n - 1;

            while(start < end){

                int sum = nums[start] + nums[end];

                if(sum == target){

                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[start]);
                    ans.add(nums[end]);

                    finalAns.add(ans);

                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start - 1]) start++;
                    while(start < end && nums[end] == nums[end + 1]) end--;

                } else if(sum > target){
                    end--;
                } else {
                    start++;
                }
            }
        }

        return finalAns;
    }
}