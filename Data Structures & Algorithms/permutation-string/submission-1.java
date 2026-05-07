class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char ch : s1.toCharArray()) {
            arr1[ch - 'a']++;
        }

        int k = s1.length();


        for (int i = 0; i < k; i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        if (matches(arr1, arr2)) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {

            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - k) - 'a']--;

            if (matches(arr1, arr2)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}