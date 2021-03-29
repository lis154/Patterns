package prototype;

import javax.swing.*;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "project", "source code = new Source code");
        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project msterProjFactClone = projectFactory.cloneProject();
        System.out.println(msterProjFactClone);

        System.out.println(master == masterClone);
        System.out.println(master == msterProjFactClone);
    }
}
