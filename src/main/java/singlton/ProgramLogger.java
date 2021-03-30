package singlton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "test";

    private ProgramLogger() {
    }

    public static ProgramLogger getLogger(){
        if (programLogger != null){
            return programLogger;
        }
        synchronized (ProgramLogger.class){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void setLogFile(String log){
        logFile += log;
    }

    public void showLogFile(){
        System.out.println(logFile);
    }


}
