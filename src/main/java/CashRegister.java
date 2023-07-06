import java.util.LinkedHashMap;
import java.util.Map;

public class CashRegister {
    public static Map<String, Integer> initializeCoinBox() {
        Map<String, Integer> coinBox = new LinkedHashMap<>();
        coinBox.put("5 zł", 1);
        coinBox.put("2 zł", 3);
        coinBox.put("1 zł", 5);
        coinBox.put("50 gr", 10);
        coinBox.put("20 gr", 20);
        coinBox.put("10 gr", 200);
        coinBox.put("5 gr", 100);
        coinBox.put("2 gr", 100);
        coinBox.put("1 gr", 10000);
        return coinBox;
    }

    public static Map<String, Integer> initializeCoinValues() {
        Map<String, Integer> coinValues = new LinkedHashMap<>();
        coinValues.put("5 zł", 500);
        coinValues.put("2 zł", 200);
        coinValues.put("1 zł", 100);
        coinValues.put("50 gr", 50);
        coinValues.put("20 gr", 20);
        coinValues.put("10 gr", 10);
        coinValues.put("5 gr", 5);
        coinValues.put("2 gr", 2);
        coinValues.put("1 gr", 1);
        return coinValues;
    }
}