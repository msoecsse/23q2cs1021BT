package sectionb.week2.quiz.inheritanceexample;

public class Driver {

    public static void main(String[] args) {

        Person john = new Person("John");
        Employee tom = new Employee("Tom",3);
        Person tomAtHome = tom;

        System.out.println(john.toString());
        tom.display();

        System.out.println(null instanceof Employee);

    }

}
