package proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://mysyte.ru/realProject");
        project.run();
    }
}
