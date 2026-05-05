class Solution {
    public boolean isPalindrome(String s) {

        String text = s.replace(" ", "").toLowerCase();
         text = text.replace("?", "");
         text = text.replace(",", "");
         text = text.replace(".", "");
         text = text.replace("\'", "");
         text = text.replace("\"", "");
         text = text.replace("!", "");
         text = text.replace("@", "");
         text = text.replace("#", "");
         text = text.replace("$", "");
         text = text.replace("&", "");
         text = text.replace("*", "");
         text = text.replace("(", "");
         text = text.replace("-", "");
         text = text.replace("+", "");
         text = text.replace(":", "");
         text = text.replace(";", "");


        int n = text.length();

        for(int i = 0 ; i<n/2; i++){
            if(text.charAt(i) != text.charAt(n-1-i)){
                return false ;
            }
        }
        return true ;
        
    }
}
