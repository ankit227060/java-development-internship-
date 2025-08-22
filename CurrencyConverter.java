public class CurrencyConverter {
    private double usdToInr = 83.0;
    private double usdToEur = 0.91;

    public double convertUsdToInr(double amount) {
        return amount * usdToInr;
    }

    public double convertUsdToEur(double amount) {
        return amount * usdToEur;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        System.out.println("100 USD to INR: " + converter.convertUsdToInr(100));
        System.out.println("100 USD to EUR: " + converter.convertUsdToEur(100));
    }}
