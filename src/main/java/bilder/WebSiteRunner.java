package bilder;

public class WebSiteRunner {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWesiteBuilder());
        Website website = director.buildWebsite();
        System.out.printf(String.valueOf(website));
    }
}
