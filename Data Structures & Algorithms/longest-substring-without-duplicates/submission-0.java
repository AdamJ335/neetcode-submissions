class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> letters = new HashSet<>();
        int res = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            while (letters.contains(s.charAt(i))) {
                letters.remove(s.charAt(l));
                l++;
            }
            letters.add(s.charAt(i));
            res = Math.max(res, i-l+1);
        }
        return res;
    }
}
