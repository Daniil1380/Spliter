import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class SeparatorTest {

    @Test
    public void l() throws IOException {
        Separator.l("TestText.txt", 100, "OutputFile\\file", true);
        File file1 = new File("OutputFile\\file1.txt");
        File fileTest1 = new File("TestFile\\fileTest11.txt");
        FileReader read1 = new FileReader(file1);
        BufferedReader buf1 = new BufferedReader(read1);
        FileReader read2 = new FileReader(fileTest1);
        BufferedReader buf2 = new BufferedReader(read2);
        String line1 = buf1.readLine();
        boolean test=true;
        String line2 = buf2.readLine();
        while (line1 != null || line2 != null) {
            if (!line1.equals(line2)) {
                test = false;
                break;
            }
            line1 = buf1.readLine();
            line2 = buf2.readLine();
        }

        Assert.assertTrue(test);
    }

    @Test
    public void c() throws IOException {
        Separator.c("TestText.txt", 90, "OutputFile\\file1", true);
        File file1 = new File("OutputFile\\file11.txt");
        File fileTest1 = new File("TestFile\\fileTest21.txt");
        FileReader read1 = new FileReader(file1);
        BufferedReader buf1 = new BufferedReader(read1);
        FileReader read2 = new FileReader(fileTest1);
        BufferedReader buf2 = new BufferedReader(read2);
        String line1 = buf1.readLine();
        boolean test = true;
        String line2 = buf2.readLine();
        while (line1 != null || line2 != null) {
            if (!line1.equals(line2)) {
                test = false;
                break;
            }
            line1 = buf1.readLine();
            line2 = buf2.readLine();
        }
        Assert.assertTrue(test);
    }

    @Test
    public void n() throws IOException {
        Separator.n("TestText.txt", 2, "OutputFile\\file2", false);
        File file1 = new File("OutputFile\\file2a.txt");
        File fileTest1 = new File("TestFile\\fileTest2a.txt");
        FileReader read1 = new FileReader(file1);
        BufferedReader buf1 = new BufferedReader(read1);
        FileReader read2 = new FileReader(fileTest1);
        BufferedReader buf2 = new BufferedReader(read2);
        String line1 = buf1.readLine();
        boolean test = true;
        String line2 = buf2.readLine();
        while (line1 != null || line2 != null) {
            if (!line1.equals(line2)) {
                test = false;
                break;
            }
            line1 = buf1.readLine();
            line2 = buf2.readLine();
        }
        Assert.assertTrue(test);
    }

    }
