package decorator;

public class SenjorJavadeveloper extends DeveloperDecorator{
    public SenjorJavadeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return " Make code review...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
