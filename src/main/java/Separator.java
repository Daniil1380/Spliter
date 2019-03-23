import java.io.*;

public class Separator {


    public static void l(String in, int x, String out, Boolean number) throws IOException {
        int i = 1;
        int namer = 0;
        BufferedReader buf = new BufferedReader(new FileReader(new File(in)));
        String line = buf.readLine();
        String n;
        if (x == 0) throw new IllegalArgumentException();
        while (line != null ) {
            if (number) n = out + String.valueOf(namer + 1) + ".txt";
            else n = out + SplitFileType.inChars(namer) + ".txt";
            FileWriter writer = new FileWriter(n);
            while (i <= x && line != null) {
                writer.write(line + "\n");
                line = buf.readLine();
                i++;
            }
            i=1;
            writer.close();
            namer++;
        }
        buf.close();
        }




    public static void c(String in, int x, String out, Boolean number) throws IOException {
        int i = 1;
        int namer = 0;
        BufferedReader buf = new BufferedReader(new FileReader(new File(in)));
        int chars = buf.read();
        String n;
        if (x == 0) throw new IllegalArgumentException();
        while (chars != -1) {
            if (number) n = out + String.valueOf(namer + 1) + ".txt";
            else n = out + SplitFileType.inChars(namer) + ".txt";
            FileWriter writer = new FileWriter(n);
            while (i <= x && chars != -1) {
                writer.write((char)chars);
                chars = buf.read();
                i++;
            }
            i=1;
            writer.close();
            namer++;
        }
        buf.close();
    }

    public static void n(String in, int x, String out, Boolean number) throws IOException {
        int i = 0;
        int num = 0;
        BufferedReader buf = new BufferedReader(new FileReader(new File(in)));
        int chars = buf.read();
        String n;
        if (x == 0) throw new IllegalArgumentException();
        while (chars != -1) {
            i++;
            chars = buf.read();
        }
        num = i / x;
        if (i % x != 0 ) num++;
        Separator.c(in, num, out, number);
    }
    }
