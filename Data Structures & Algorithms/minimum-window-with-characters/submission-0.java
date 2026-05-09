class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] target = new int[128];
        int[] window = new int[128];

        // Store frequency of t
        for (char ch : t.toCharArray()) {
            target[ch]++;
        }

        int left = 0;
        int matched = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        // Expand window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character
            window[ch]++;

            // Count valid matched characters
            if (target[ch] > 0 && window[ch] <= target[ch]) {
                matched++;
            }

            // Window becomes valid
            while (matched == t.length()) {

                // Update minimum answer
                int currentLen = right - left + 1;

                if (currentLen < minLen) {

                    minLen = currentLen;
                    startIndex = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                window[leftChar]--;

                // Window becomes invalid
                if (target[leftChar] > 0 &&
                    window[leftChar] < target[leftChar]) {

                    matched--;
                }

                // Shrink window
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }
}