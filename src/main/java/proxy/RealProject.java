package proxy;

public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("loading project from " + url);
    }

    public void run() {
        System.out.println("running project " + url + " ...");
    }
}
