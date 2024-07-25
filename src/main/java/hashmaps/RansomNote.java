package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (magazineCount.getOrDefault(c, 0) != 0) {
                magazineCount.put(c, magazineCount.getOrDefault(c, 0) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
