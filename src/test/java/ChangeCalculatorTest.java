import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChangeCalculatorTest {
    private Map<String, Integer> coinBox =  new LinkedHashMap<>();
    private Map<String, Integer> coinValues =  new LinkedHashMap<>();
    ChangeCalculator changeCalculator = new ChangeCalculator(coinBox,coinValues);

    @Before
    public void init() {
        coinBox.put("5 zł", 1);
        coinBox.put("2 zł", 3);
        coinBox.put("1 zł", 5);
        coinBox.put("50 gr", 10);
        coinBox.put("20 gr", 20);
        coinBox.put("10 gr", 200);
        coinBox.put("5 gr", 100);
        coinBox.put("2 gr", 100);
        coinBox.put("1 gr", 10000);


        coinValues.put("5 zł", 500);
        coinValues.put("2 zł", 200);
        coinValues.put("1 zł", 100);
        coinValues.put("50 gr", 50);
        coinValues.put("20 gr", 20);
        coinValues.put("10 gr", 10);
        coinValues.put("5 gr", 5);
        coinValues.put("2 gr", 2);
        coinValues.put("1 gr", 1);

    }

    @Test
    public void testDispenseChange() {
       int  change = 130;
        String expectedOutput ="Wydaj 1 monet 1 zł\n" +
                "Wydaj 1 monet 20 gr\n" +
                "Wydaj 1 monet 10 gr\n";

        String actualOutput = changeCalculator.dispenseChange(change);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testDispenseChange_11_70() {
        int change = 1170;
        String expectedOutput ="Wydaj 1 monet 5 zł\n" +
                "Wydaj 3 monet 2 zł\n" +
                "Wydaj 1 monet 50 gr\n" +
                "Wydaj 1 monet 20 gr\n";

        String actualOutput = changeCalculator.dispenseChange(change);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testDispenseChange_6_70() {
        int change = 670;
        String expectedOutput = "Wydaj 1 monet 5 zł\n" +
                "Wydaj 1 monet 1 zł\n" +
                "Wydaj 1 monet 50 gr\n" +
                "Wydaj 1 monet 20 gr\n";

        String actualOutput = changeCalculator.dispenseChange(change);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testDispenseChange_4_30() {
        int change = 430;
        String expectedOutput = "Wydaj 2 monet 2 zł\n" +
                "Wydaj 1 monet 20 gr\n" +
                "Wydaj 1 monet 10 gr\n";

        String actualOutput = changeCalculator.dispenseChange(change);

        assertEquals(expectedOutput, actualOutput);
    }
}