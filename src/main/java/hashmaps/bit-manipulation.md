Bit manipulation involves the use of bitwise operators to perform operations directly on the binary representations of numbers. This can be a very efficient way to perform certain types of computations. Let's go through the basics of bit manipulation in Java, the different bitwise operators, and how they can be used.

### Bitwise Operators in Java

1. **AND (`&`)**: Performs a bitwise AND operation.
   - `a & b` will result in a bit being set only if both corresponding bits of `a` and `b` are set.
   - Example: `5 & 3` (binary `0101 & 0011`) results in `0001` (1 in decimal).

2. **OR (`|`)**: Performs a bitwise OR operation.
   - `a | b` will result in a bit being set if at least one of the corresponding bits of `a` or `b` is set.
   - Example: `5 | 3` (binary `0101 | 0011`) results in `0111` (7 in decimal).

3. **XOR (`^`)**: Performs a bitwise exclusive OR operation.
   - `a ^ b` will result in a bit being set if only one of the corresponding bits of `a` or `b` is set.
   - Example: `5 ^ 3` (binary `0101 ^ 0011`) results in `0110` (6 in decimal).

4. **NOT (`~`)**: Performs a bitwise NOT operation (unary operator).
   - `~a` inverts all the bits of `a`.
   - Example: `~5` (binary `0101`) results in `1010` (in 4-bit representation, it would be `11111010` for an 8-bit integer, which is -6 in decimal due to two's complement representation).

5. **Left Shift (`<<`)**: Shifts the bits of a number to the left by a specified number of positions.
   - `a << b` shifts the bits of `a` to the left by `b` positions, filling with zeros.
   - Example: `5 << 1` (binary `0101 << 1`) results in `1010` (10 in decimal).

6. **Right Shift (`>>`)**: Shifts the bits of a number to the right by a specified number of positions.
   - `a >> b` shifts the bits of `a` to the right by `b` positions, filling with the sign bit (arithmetic shift).
   - Example: `5 >> 1` (binary `0101 >> 1`) results in `0010` (2 in decimal).

7. **Unsigned Right Shift (`>>>`)**: Shifts the bits of a number to the right by a specified number of positions, filling with zeros (logical shift).
   - `a >>> b` shifts the bits of `a` to the right by `b` positions, filling with zeros regardless of the sign.
   - Example: `-5 >>> 1` (binary `11111111111111111111111111111011 >>> 1`) results in `01111111111111111111111111111101` (2147483645 in decimal).

### Practical Uses of Bit Manipulation

1. **Setting a Bit**: To set the ith bit of a number.
   ```java
   int number = 5; // binary 0101
   int i = 1;
   number |= 1 << i; // Sets the 1st bit, result is 7 (binary 0111)
   ```

2. **Clearing a Bit**: To clear the ith bit of a number.
   ```java
   int number = 5; // binary 0101
   int i = 2;
   number &= ~(1 << i); // Clears the 2nd bit, result is 1 (binary 0001)
   ```

3. **Toggling a Bit**: To toggle the ith bit of a number.
   ```java
   int number = 5; // binary 0101
   int i = 0;
   number ^= 1 << i; // Toggles the 0th bit, result is 4 (binary 0100)
   ```

4. **Checking a Bit**: To check if the ith bit of a number is set.
   ```java
   int number = 5; // binary 0101
   int i = 2;
   boolean isSet = (number & (1 << i)) != 0; // Checks the 2nd bit, result is true
   ```

### Example: Checking if a String is a Pangram Using Bit Manipulation

Let's revisit the previous example to check if a given sentence is a pangram:

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        int mask = 0; // Initialize a bitmask to 0
        for (int i = 0; i < sentence.length(); ++i) {
            // Set the bit corresponding to the current character
            mask |= 1 << (sentence.charAt(i) - 'a');
        }
        // Check if all 26 bits are set
        return mask == (1 << 26) - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); // true
        System.out.println(solution.checkIfPangram("leetcode")); // false
    }
}
```

### Explanation of Pangram Check

1. **Initialization**: `int mask = 0;` initializes the bitmask to 0.
2. **Iterating Through the Sentence**: For each character in the sentence, the corresponding bit in `mask` is set.
   - `(sentence.charAt(i) - 'a')` calculates the position of the character in the alphabet (0 for 'a', 1 for 'b', ..., 25 for 'z').
   - `1 << (sentence.charAt(i) - 'a')` creates a bitmask with the bit set at the position of the character.
   - `mask |= 1 << (sentence.charAt(i) - 'a')` sets the corresponding bit in `mask`.
3. **Final Check**: `mask == (1 << 26) - 1` checks if all 26 bits are set.
   - `(1 << 26) - 1` results in a number with all first 26 bits set to 1 (`11111111111111111111111111` in binary).

### Conclusion

Bit manipulation is a powerful technique that can lead to highly efficient solutions for certain types of problems. Understanding the bitwise operators and how to use them effectively can significantly improve the performance of your code. The example provided demonstrates how bit manipulation can be used to solve a common problem efficiently.