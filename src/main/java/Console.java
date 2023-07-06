import java.math.BigDecimal;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        ChangeCalculator changeCalculator = new ChangeCalculator(CashRegister.initializeCoinBox(), CashRegister.initializeCoinValues());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj resztę do wydania (lub wpisz 'koniec' aby zakończyć): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("koniec")) {
                break;
            }
            try {
                BigDecimal decimalValue = new BigDecimal(input);
                BigDecimal multipliedValue = decimalValue.multiply(new BigDecimal("100"));
                int change = multipliedValue.intValue();
                System.out.println(changeCalculator.dispenseChange(change));

            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format reszty. Spróbuj ponownie.");
            }
            System.out.println();
        }
    }
}
