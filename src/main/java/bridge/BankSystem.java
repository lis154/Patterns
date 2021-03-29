package bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Bank System development in prograss ...");
        developer.writeCode();
    }
}
