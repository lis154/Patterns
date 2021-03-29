package bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Stock exchange development in prograss ...");
        developer.writeCode();
    }
}
