package decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer =  new JavaTeamLead(new SenjorJavadeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
