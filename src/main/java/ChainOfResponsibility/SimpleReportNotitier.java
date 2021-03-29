package ChainOfResponsibility;

public class SimpleReportNotitier extends Notifier{
    public SimpleReportNotitier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier using Simple report " + message);
    }
}
