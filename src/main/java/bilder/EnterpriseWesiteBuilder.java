package bilder;

public class EnterpriseWesiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
