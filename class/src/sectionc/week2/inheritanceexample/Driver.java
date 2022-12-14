package sectionc.week2.inheritanceexample;

public class Driver {

    public static void main(String[] args) {

        Person john = new Person("John");
        Employee bill = new Employee("Bill",1);
        Person billAtHome = (Person) bill;

        billAtHome.display();


    }

}
