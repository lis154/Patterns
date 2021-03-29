package bridge;

public class ProgramCreateor {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program: programs) {
        program.developProgram();
        }
    }
}
