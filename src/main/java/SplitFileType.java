public class SplitFileType {
    public static String inChars(int n) {
        StringBuilder str = new StringBuilder();
        if (n == 0) return "a";
        while (n > 0) {
            str.append((char)(n % 26 + 97));
            n /= 26;
        }
        return str.reverse().toString();
    }
}
