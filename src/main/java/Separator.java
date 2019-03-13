import java.io.*;

public class Separator {


    public static void l(String in, int x, String out, Boolean number) throws IOException {
        int i = 1;
        int namer = 0;
        File file = new File(in);
        FileReader read = new FileReader(file);
        BufferedReader buf = new BufferedReader(read);
        String line = buf.readLine();
        String n;
        if (x == 0) throw new IllegalArgumentException();
        while (line != null) {
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
        File file = new File(in);
        FileReader read = new FileReader(file);
        BufferedReader buf = new BufferedReader(read);
        int line = buf.read();
        String n;
        if (x == 0) throw new IllegalArgumentException();
        while (line != -1) {
            if (number) n = out + String.valueOf(namer + 1) + ".txt";
            else n = out + SplitFileType.inChars(namer) + ".txt";
            FileWriter writer = new FileWriter(n);
            while (i <= x && line != -1) {
                writer.write((char)line);
                line = buf.read();
                if (line != 13 && line != 10) i++;
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
        File file = new File(in);
        FileReader read = new FileReader(file);
        BufferedReader buf = new BufferedReader(read);
        int line = buf.read();
        String n;
        if (x == 0) throw new IllegalArgumentException();
        while (line != -1) {
            if (line == 10) i++;
            line = buf.read();
        }
        i++;
        num = i / x;
        if (i % x != 0 ) num++;
        Separator.l(in, num, out, number);
    }
    }


