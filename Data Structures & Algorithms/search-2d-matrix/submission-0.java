class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;

       int left = 0 , row , col , right = n-1, top = 0 , buttom = m-1;

       while(top<=buttom){
        row = top + (buttom-top)/2;
        left = 0 ;
        right = n-1;
            while(left<=right){
                col =left+(right-left)/2;
                if(matrix[row][col] == target){
                    return true ;
                }else if(matrix[row][col]>target){
                    right = col-1;
                }else{
                    left = col+1;
                }
            }
            if(matrix[row][0]>target){
                buttom = row-1;
            }else{
                top = row+1;
            }
       }
       return false ;
    }
}
