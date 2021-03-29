package ChainOfResponsibility;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.FormatFlagsConversionMismatchException;

public class Bugtracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotitier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        reportNotifier.notifyManager("Everythin is ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Hsten, we have a problem here", Priority.ASAP);
    }
}
