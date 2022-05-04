import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestReturnNthString {

    ReturnNthString returnNthString;

    @Before
    public void TestReturnNthString(){
        returnNthString = new ReturnNthString();
    }

    @Test
    public void testReturnStringGivenN1(){
        assertEquals(returnNthString.returnString("ITCLiNiCal",1), "ITCLNA");
    }

    @Test
    public void testReturnStringGivenN2(){
        assertEquals(returnNthString.returnString("ITCLiNiCal",2), "TLN");
    }

    @Test
    public void testReturnStringGivenN3(){
        assertEquals(returnNthString.returnString("ITCLiNiCal",3), "CNA");
    }

    @Test
    public void testReturnStringGivenNBiggerThanWordLength(){
        assertEquals(returnNthString.returnString("ITCLiNiCal",100), " ");
    }

    @Test
    public void testReturnStringGivenNIsNegative(){
        assertEquals(returnNthString.returnString("ITCLiNiCal",-1), " ");
    }


}
