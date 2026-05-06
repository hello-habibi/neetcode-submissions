class Solution {
    public int maxArea(int[] heights) {

        int ans = 0;
        int start = 0, end = heights.length - 1;

        while(start < end){
            int width = end - start;
            int height = Math.min(heights[start], heights[end]);

            ans = Math.max(ans, width * height);

            if(heights[start] < heights[end]){
                start++;
            } else {
                end--;
            }
        }

        return ans;
    }
}