class Solution {

    public int characterReplacement(String s, int k) {

        int left = 0, n = s.length();

        int len = 0;
        int maxFreq = 0;
        int ans = 0;

        int[] freq = new int[26];

        for (int right = 0; right < n; right++) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq,
                    freq[s.charAt(right) - 'A']);

            len = right - left + 1;

            int rep = len - maxFreq;

            if (rep > k) {

                freq[s.charAt(left) - 'A']--;

                left++;

                len = right - left + 1;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}