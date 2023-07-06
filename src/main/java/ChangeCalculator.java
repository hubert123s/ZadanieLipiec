import java.util.Map;

public class ChangeCalculator {
    private final Map<String,Integer> coinBox;
    private final Map<String,Integer> coinValues;
    public ChangeCalculator(Map<String,Integer> initializeCoinBox,Map<String,Integer> initializeCoinValues ) {
        this.coinBox = initializeCoinBox;
        this.coinValues = initializeCoinValues;
    }
    public String dispenseChange(int change) {
        StringBuilder result = new StringBuilder();
        if (change == 0) {
            return result.toString();
        }

        for (Map.Entry<String, Integer> entry : coinValues.entrySet()) {
            int denomination = entry.getValue();
            int amount = coinBox.get(entry.getKey());

            if (change >= denomination && amount > 0) {
                int dispensed = Math.min(change / denomination, amount);
                change -= dispensed * entry.getValue();
                coinBox.put(entry.getKey(), amount - dispensed);

                if (denomination>=100) {
                    result.append("Wydaj ").append(dispensed).append(" monet ").append(entry.getKey()).append("\n");
                } else {
                    result.append("Wydaj ").append(dispensed).append(" monet ").append(entry.getKey()).append("\n");
                }

                break;
            }
        }
        return result.append(dispenseChange(change)).toString();
    }
}
