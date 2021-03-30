package singlton;

public class Client {

    public static void main(String[] args) {
        System.out.println(ProgramLogger.getLogger().toString());

        System.out.println(ProgramLogger.getLogger() == ProgramLogger.getLogger());

        ProgramLogger.getLogger().setLogFile("111");
        ProgramLogger.getLogger().setLogFile("222");
        ProgramLogger.getLogger().setLogFile("333");
        ProgramLogger.getLogger().showLogFile();

    }
}
