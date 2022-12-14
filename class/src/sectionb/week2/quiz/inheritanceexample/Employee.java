package sectionb.week2.quiz.inheritanceexample;

public class Employee extends Person{

    private int ID;

    public Employee(String name, int ID){
        super(name);
        this.ID = ID;
    }

    public void display(){
        System.out.println("Name: " + this.getName() + " ID: " + this.ID);
    }

}
