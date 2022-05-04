import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestReturnNthString {

    private ReturnNthString returnNthString;
    private String word = "ITCLiNicAl";

    @Before
    public void TestReturnNthString(){
        returnNthString = new ReturnNthString();
    }

    @Test
    public void testReturnStringGivenN1(){
        assertEquals(returnNthString.returnString(word,1), "ITCLNA");
    }

    @Test
    public void testReturnStringGivenN2(){
        assertEquals(returnNthString.returnString(word,2), "TLN");
    }

    @Test
    public void testReturnStringGivenN3(){
        assertEquals(returnNthString.returnString(word,3), "CNA");
    }

    @Test
    public void testReturnStringGivenNBiggerThanWordLength(){
        assertEquals(returnNthString.returnString(word,100), " ");
    }

    @Test
    public void testReturnStringGivenNIsNegative(){
        assertEquals(returnNthString.returnString(word,-1), " ");
    }

    @Test
    public void strangeNumberCharactersReturn(){
        assertEquals(returnNthString.returnString("!tCL1Nical",1), "!CL1N");
    }
}
