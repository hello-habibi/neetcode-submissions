

class Solution {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        if (n == 0) {
            return 0;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        int start = 0, end = 0, maxi = 1, ans = 1;

        while (end < n) {

            char ch = s.charAt(end);

            if (hm.containsKey(ch) && hm.get(ch) >= start) {

                start = hm.get(ch) + 1;
            }

            hm.put(ch, end);

            maxi = end - start + 1;

            ans = Math.max(ans, maxi);

            end++;
        }

        return ans;
    }
}