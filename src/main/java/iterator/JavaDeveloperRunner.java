package iterator;


public class JavaDeveloperRunner {
    public static void main(String[] args) {


        String[] skills = {"java", "spring", "hibernate", "maven", "git"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Ilya Lapshinov", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println(javaDeveloper.getName());

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }

    }
}
