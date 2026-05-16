
class Solution {
    public int largestRectangleArea(int[] heights) {

        int n =heights.length;

        int[] prevLow = new int[n];
        int[] nextLow= new int[n];

        Stack<Integer> stack = new Stack<>();
        Arrays.fill(prevLow, -1);
        Arrays.fill(nextLow,n);

        // For the next calculation 
        for(int i = 0 ;i<n;i++){

            while( !stack.isEmpty() && heights[stack.peek()]>heights[i]){
                nextLow[stack.pop()]= i;

            }
            stack.push(i);
        }

        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                prevLow[stack.pop()] = i ;
                        }
        
            stack.push(i);
                    }
        

                    int ans= 0 , presVal ; 
                    for(int i = 0 ;i<n; i++){
                        presVal =heights[i] * (nextLow[i] - prevLow[i] -1);
                        ans = Math.max(ans, presVal);
                    }
        return ans;
    }
}
