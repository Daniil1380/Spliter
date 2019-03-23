import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class SeparatorTest {

    public boolean equalsText(File x, File y) throws IOException {
        FileReader read1 = new FileReader(x);
        BufferedReader buf1 = new BufferedReader(read1);
        FileReader read2 = new FileReader(y);
        BufferedReader buf2 = new BufferedReader(read2);
        String line1 = buf1.readLine();
        boolean test = true;
        String line2 = buf2.readLine();
        while (line1 != null || line2 != null) {
            assert line1 != null;
            if (!line1.equals(line2)) {
                test = false;
                break;
            }
            line1 = buf1.readLine();
            line2 = buf2.readLine();
        }
        return test;
    }

    @Test
    public void l() throws IOException {
        Separator.l("TestText.txt", 100, "OutputFile\\file", true);
        File file1 = new File("OutputFile\\file1.txt");
        File fileTest1 = new File("TestFile\\fileTest11.txt");
        Assert.assertTrue(equalsText(file1, fileTest1));
    }

    @Test
    public void c() throws IOException {
        Separator.c("TestText.txt", 90, "OutputFile\\file1", true);
        File file1 = new File("OutputFile\\file11.txt");
        File fileTest1 = new File("TestFile\\fileTest21.txt");
        Assert.assertTrue(equalsText(file1, fileTest1));
    }

    @Test
    public void n() throws IOException {
        Separator.n("TestText.txt", 2, "OutputFile\\file2", false);
        File file1 = new File("OutputFile\\file2a.txt");
        File fileTest1 = new File("TestFile\\fileTest2a.txt");
        Assert.assertTrue(equalsText(file1, fileTest1));
    }
    }

