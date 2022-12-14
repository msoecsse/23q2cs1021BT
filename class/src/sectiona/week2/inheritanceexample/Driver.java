package sectiona.week2.inheritanceexample;

public class Driver {

    public static void main(String[] args) {

        Person john = new Person("John");
//        Employee tom = new Employee("Tom",12);
//        Person tomAtHome = tom;
        Person tom = new Employee("Tom", 12);

        tom.display();
        john.display();

    }


}
