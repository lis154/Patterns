package abstracktFactory.webSite;

import abstracktFactory.Developer;
import abstracktFactory.ProjectManager;
import abstracktFactory.ProjectTeamFactory;
import abstracktFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new ProjectManagerWebSite();
    }
}
