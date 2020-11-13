package task03Streams;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class TextUtilsTest {
    private static File file = new File("text.txt");
    private double avgLength;

    @Test
    public void countWords() {

        long total = TextUtils.countWords(file);
        Assert.assertEquals(10,total);

    }

    @Test
    public void avgLength() {
        avgLength = TextUtils.avgLength(file);
        Assert.assertEquals(4,avgLength,0.0001);

    }
}