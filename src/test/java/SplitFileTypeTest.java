import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplitFileTypeTest {

    @Test
    public void inChars() {
        Assert.assertEquals("caz", SplitFileType.inChars(1352+25));
        Assert.assertEquals("a", SplitFileType.inChars(0));
    }


    @Test(expected = IllegalArgumentException.class)
    public void inCharsEx() {
        Assert.assertEquals("a", SplitFileType.inChars(-1));
    }

}