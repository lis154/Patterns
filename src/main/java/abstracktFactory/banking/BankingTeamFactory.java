package abstracktFactory.banking;

import abstracktFactory.Developer;
import abstracktFactory.ProjectManager;
import abstracktFactory.ProjectTeamFactory;
import abstracktFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
