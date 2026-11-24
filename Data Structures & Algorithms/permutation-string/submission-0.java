class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // iterating through first window for number of matches in alphabet
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) {
                matches++;
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) {
                return true;
            }

            int index = s2.charAt(r) - 'a';
            s2Count[index]++; // moving pane across
            if (s1Count[index] == s2Count[index]) {
                matches++;
            } else if (s1Count[index] + 1 == s2Count[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            s2Count[index]--;
            if (s1Count[index] == s2Count[index]) {
                matches++;
            } else if (s1Count[index] - 1 == s2Count[index]) {
                matches --;

            }
            l++;
        }
        return matches == 26;

    //     String sortedS1 = sort(s1)

    //     for (int i = 0; i <= s2.length() - s1.length(); i++) {
    //         String subString = s2.substring(i, i + s1.length());
    //         if (sort(subString).equals(sortedS1)){
    //             return true;
    //         }
    //     }
    //     return false;
        
    // }

    // private String sort(String inputString) {
    //     char tempArray[] = inputString.toCharArray();

    //     Arrays.sort(tempArray);

    //     return new String(tempArray);
    }
}
