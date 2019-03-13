public class SplitFileType {
    public static String inChars(int n) {
        StringBuilder str = new StringBuilder();
        if (n < 0) throw new IllegalArgumentException();
        do {
            str.append((char)(n % 26 + 97));
            n /= 26;
        } while (n > 0);
        return str.reverse().toString();
    }
}
