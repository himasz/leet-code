package hashmaps;

public class CheckIfTheSentenceIsPangram {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            boolean[] vis = new boolean[26];
            for (int i = 0; i < sentence.length(); ++i) {
                vis[sentence.charAt(i) - 'a'] = true;
            }
            for (boolean v : vis) {
                if (!v) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean CheckIfTheSentenceIsPangramBitManipulation(String sentence) {
        int mask = 0;
        for (int i = 0; i < sentence.length(); ++i) {
            mask |= 1 << (sentence.charAt(i) - 'a');
        }
        return mask == (1 << 26) - 1;
    }

}
