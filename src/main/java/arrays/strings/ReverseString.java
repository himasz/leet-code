package arrays.strings;

public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }

    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(a);
        new ReverseString().reverseString(a);
        System.out.println(a);
        char[] b = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println(b);
        new ReverseString().reverseString(b);
        System.out.println(b);

    }
}
