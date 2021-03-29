package template;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newspage = new Newspage();
        welcomePage.showPage();
        System.out.println("\n++++++++++++++++++++++++++++++++++++\n");
        newspage.showPage();
    }
}
